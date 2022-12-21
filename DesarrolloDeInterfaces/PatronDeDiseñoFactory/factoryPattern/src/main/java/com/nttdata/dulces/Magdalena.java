package com.nttdata.dulces;
/**
 * 
 * Clase que representa al dulce del obrador de tipo Magdalena
 * 
 * @author RAFA
 *
 */
public class Magdalena  implements Dulce{

	@Override
	public void etiqueta() {
		System.out.println("La etiqueta de la Magdalena dice:");
		System.out.println("-Es esponjosa");
		System.out.println("-Como las de La Bella Easo");
		
	}

}
