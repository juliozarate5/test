package co.com.julio.tyslanguage.servicio.service.language.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.com.julio.tyslanguage.servicio.service.language.dto.EtiquetaDto;
import co.com.julio.tyslanguage.servicio.service.language.dto.SimboloDto;
import co.com.julio.tyslanguage.servicio.service.language.iface.EtiquetaService;
import co.com.julio.tyslanguage.servicio.util.Utils;

@Service
public class EtiquetaServiceImpl implements EtiquetaService {

	@Override
	public EtiquetaDto obtenerEtiquetas(EtiquetaDto etiquetaDto) {
		/**
		 * Validamos que la estructura enviada en el mensaje sea valida
		 */
		if (!isValidacionReglas(etiquetaDto.getMensaje())) {
			etiquetaDto.setRespuesta(Utils.MALA_SINTAXIS);
			etiquetaDto.setEstado(false);
			return etiquetaDto;
		}

		String mensaje = etiquetaDto.getMensaje().trim();

		/**
		 * Obtenemos los simbolos y los mensajes
		 */
		String[] mensajes = mensaje.split("\n");

		/**
		 * Validamos el arreglo
		 */
		if (mensajes == null || mensajes.length == 0) {
			etiquetaDto.setRespuesta(Utils.MALA_SINTAXIS);
			etiquetaDto.setEstado(false);
			return etiquetaDto;
		}

		List<SimboloDto> simbolos = new ArrayList<>();

		for (int i = 0; i < mensajes.length; i++) {
			String[] mnjs = mensajes[i].split(" ");
			SimboloDto simbolo = new SimboloDto();
			simbolo.setSimbolo(mnjs[0]);
			if(mensajes[i].length() > 1 && !mensajes[i].substring(1,2).equals("#") && !mensajes[i].substring(1,2).equals(" ")) {
				etiquetaDto.setRespuesta(Utils.MALA_SINTAXIS);
				etiquetaDto.setEstado(false);
				return etiquetaDto;
			}
			for (int j = 1; j < mnjs.length; j++) {
				if (simbolo.getMensaje() != null && simbolo.getMensaje().length() > 0) {
					String simboloTemp = simbolo.getMensaje() + " " + mnjs[j];
					simbolo.setMensaje(simboloTemp);
				} else {
					simbolo.setMensaje(mnjs[j]);
				}
			}

			simbolos.add(simbolo);
		}

		if (simbolos == null || simbolos.size() == 0) {
			etiquetaDto.setRespuesta(Utils.MALA_SINTAXIS);
			etiquetaDto.setEstado(false);
			return etiquetaDto;
		}

		StringBuilder builder = new StringBuilder();
		builder.append(Utils.CUERPO_BODY_1 + "\n");

		/**
		 * Armamos dinamicamente la estructura
		 */
		for (SimboloDto simboloDto : simbolos) {
			Optional<SimboloDto> existe = Utils.LISTA_SIMBOLOS.stream()
					.filter(x -> x.getSimbolo().equals(simboloDto.getSimbolo())).findFirst();
			if (!existe.isPresent()) {
				continue;
			}
			builder.append(existe.get().getTagInicio()).append(simboloDto.getMensaje())
					.append(existe.get().getTagInicio() + "\n");
		}

		builder.append(Utils.CUERPO_BODY_2);
		etiquetaDto.setRespuesta(builder.toString());
		etiquetaDto.setEstado(true);

		return etiquetaDto;
	}

	/**
	 * Validamos las reglas de negocio del mensaje
	 * 
	 * @param mensaje
	 * @return
	 */
	private boolean isValidacionReglas(String mensaje) {
		// Validaciones
		mensaje = mensaje.trim();
		if(!mensaje.substring(0, 1).equals("#")) {
			return false;
		}
		return true;
	}

}