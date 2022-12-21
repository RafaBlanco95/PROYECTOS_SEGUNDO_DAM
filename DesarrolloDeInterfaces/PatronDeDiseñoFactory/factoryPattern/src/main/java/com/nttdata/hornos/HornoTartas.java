package com.nttdata.hornos;

import com.nttdata.dulces.Dulce;
import com.nttdata.dulces.Tarta;

/**
 * 
 * Clase que permite crear dulces del tipo Tarta
 * 
 * @author RAFA
 *
 */
public class HornoTartas implements GeneradorDeDulces {

	@Override
	public Dulce cocinarDulce() {

		return new Tarta();
	}

}
