package com.nttdata.dulces;

/**
 * 
 * Clase que representa al dulce del obrador de tipo Tarta
 * 
 * @author RAFA
 *
 */
public class Tarta implements Dulce{

	@Override
	public void etiqueta() {
		System.out.println("La etiqueta de la porción de Tarta dice:");
		System.out.println("-Es de cumpleaños");
		System.out.println("-Es tarta de queso");
		
	}

}
