package co.com.julio.tyslanguage.servicio.service.language.dto;

/**
 * Dto
 * @author Caroline
 *
 */
public class EtiquetaDto {
	private String respuesta;
	private String mensaje; // # mensaje 1 ## mensaje2, ### mensaje 3
	private boolean estado;

	public EtiquetaDto() {
		
	}

	/**
	 * @return the respuesta
	 */
	public String getRespuesta() {
		return respuesta;
	}

	/**
	 * @param respuesta the respuesta to set
	 */
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	/**
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
