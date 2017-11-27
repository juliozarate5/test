/**
 * 
 */
package co.com.julio.tyslanguage.servicio.util;


import java.util.ArrayList;
import java.util.List;

import co.com.julio.tyslanguage.servicio.service.language.dto.SimboloDto;

/**
 * Clase para guardar variables estaticas de la app
 * @author Caroline
 *
 */
public class Utils {
		
	public static final String CUERPO_BODY_1 = "<!DOCTYPE html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
			"<meta charset=\"utf-8\">\r\n" + 
			"<title></title>\r\n" + 
			"</head>\r\n" + 
			"<body>";
	
	public static final String CUERPO_BODY_2 = "</body>\r\n" + 
			"</html>";
	
	/**
	 * Collection de simbolos y etiquetas
	 */
	public static final List <SimboloDto> LISTA_SIMBOLOS = new ArrayList<>();
	static{
		LISTA_SIMBOLOS.add(new SimboloDto("#", "<h1>", "</h1>"));
		LISTA_SIMBOLOS.add(new SimboloDto("##", "<h2>", "</h2>"));	
		LISTA_SIMBOLOS.add(new SimboloDto("###", "<h3>", "</h3>"));	
		LISTA_SIMBOLOS.add(new SimboloDto("####", "<h4>", "</h4>"));	
		LISTA_SIMBOLOS.add(new SimboloDto("#####", "<h5>", "</h5>"));	
		LISTA_SIMBOLOS.add(new SimboloDto("######", "<h6>", "</h6>"));
	}
	
	public static final String MALA_SINTAXIS = "<!DOCTYPE html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
			"<meta charset=\"utf-8\">\r\n" + 
			"<title></title>\r\n" + 
			"</head>\r\n" + 
			"<body>\r\n" + 
			"#Mala sintaxis\r\n" + 
			"</body>\r\n" + 
			"</html>";


}
