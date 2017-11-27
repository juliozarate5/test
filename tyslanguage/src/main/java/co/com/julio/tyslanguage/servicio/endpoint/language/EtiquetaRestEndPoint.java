package co.com.julio.tyslanguage.servicio.endpoint.language;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.julio.tyslanguage.servicio.service.language.dto.EtiquetaDto;
import co.com.julio.tyslanguage.servicio.service.language.iface.EtiquetaService;

@RestController
public class EtiquetaRestEndPoint {
	private static final String MODULO = "language";
	private static final String ENTIDAD = "etiqueta";
	
	//inyeccion de dependencia del servicio (logica de negocio)
	@Autowired
	private EtiquetaService etiquetaService;
		
	private final Logger logger = Logger.getLogger(EtiquetaRestEndPoint.class);
	 
	/**
	 * 
	 * @param dto
	 * @return
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/" + MODULO + "/" + ENTIDAD + "", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<EtiquetaDto> obtenerEtiquetas(@RequestBody EtiquetaDto dto) {
		ResponseEntity<EtiquetaDto> responseEntity;
		try {
			EtiquetaDto etiquetaDto = etiquetaService.obtenerEtiquetas(dto);
			responseEntity = new ResponseEntity<>(etiquetaDto, HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("ERROR EN SERVICIO OBTENER ETIQUETAS", ex);
			responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return responseEntity;
	}
}
