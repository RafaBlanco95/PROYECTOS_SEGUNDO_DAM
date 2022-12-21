package com.nttdata.hornos;

import com.nttdata.dulces.Dulce;
import com.nttdata.dulces.Magdalena;

/**
 * 
 * Clase que permite crear dulces del tipo Magdalena
 * 
 * @author RAFA
 *
 */
public class HornoMagdalenas implements GeneradorDeDulces {

	@Override
	public Dulce cocinarDulce() {

		return new Magdalena();
	}

}
