package com.nttdata.dulces;
/**
 * 
 * Clase que representa al dulce del obrador de tipo Croissant
 * 
 * @author RAFA
 *
 */
public class Croissant implements Dulce{

	@Override
	public void etiqueta() {
		System.out.println("La etiqueta del Croissant dice:");
		System.out.println("-Cruje al Morderlo");
		System.out.println("-Sabe a Mantequilla");
		
	}
	
}
