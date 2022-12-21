package com.nttdata.hornos;

import com.nttdata.dulces.Croissant;
import com.nttdata.dulces.Dulce;

/**
 * 
 * Clase que permite crear dulces del tipo Croissant
 * 
 * @author RAFA
 *
 */
public class HornoCroissants implements GeneradorDeDulces {

	@Override
	public Dulce cocinarDulce() {

		return new Croissant();
	}

}
