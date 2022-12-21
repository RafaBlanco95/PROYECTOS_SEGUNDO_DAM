package com.nttdata.hornos;

import com.nttdata.dulces.Dulce;

/**
 * 
 * Interfaz compartida por las clases generadoras (hornos) de objetos (dulces)
 * 
 * @author RAFA
 *
 */

public interface GeneradorDeDulces {
	/**
	 * 
	 * Método que permite instanciar dulces en el obrador
	 * 
	 * @return
	 */
	public Dulce cocinarDulce();

}
