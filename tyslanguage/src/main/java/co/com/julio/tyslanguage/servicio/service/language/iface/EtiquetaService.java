package co.com.julio.tyslanguage.servicio.service.language.iface;

import co.com.julio.tyslanguage.servicio.service.language.dto.EtiquetaDto;

/**
 * Interface para manejar logicia de negocio
 * @author Caroline ctrl + shit + o (letra o) quita import que no se usen
 *
 */
public interface EtiquetaService {

	/**
	 * 
	 * @param etiquetaDto
	 * @return
	 */
	EtiquetaDto obtenerEtiquetas(EtiquetaDto etiquetaDto);
}
