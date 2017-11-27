package co.com.julio.tyslanguage.servicio.service.language.dto;

public class SimboloDto {
	
	private String simbolo;
	private String tagInicio;
	private String tagFin;
	private String mensaje;
	
	public SimboloDto() {
		
	}
	
	public SimboloDto(String simbolo, String tagInicio, String tagFin) {
		super();
		this.simbolo = simbolo;
		this.tagInicio = tagInicio;
		this.tagFin = tagFin;
	}
	/**
	 * @return the simbolo
	 */
	public String getSimbolo() {
		return simbolo;
	}
	/**
	 * @return the tagInicio
	 */
	public String getTagInicio() {
		return tagInicio;
	}
	/**
	 * @return the tagFin
	 */
	public String getTagFin() {
		return tagFin;
	}
	/**
	 * @param simbolo the simbolo to set
	 */
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	/**
	 * @param tagInicio the tagInicio to set
	 */
	public void setTagInicio(String tagInicio) {
		this.tagInicio = tagInicio;
	}
	/**
	 * @param tagFin the tagFin to set
	 */
	public void setTagFin(String tagFin) {
		this.tagFin = tagFin;
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
	
	
}
