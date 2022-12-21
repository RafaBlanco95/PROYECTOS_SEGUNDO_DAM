package com.nttdata.hornos;

import com.nttdata.dulces.Croissant;
import com.nttdata.dulces.Dulce;
import com.nttdata.dulces.Magdalena;
import com.nttdata.dulces.Tarta;

/**
 * 
 * Clase que permite crear diferentes dulces de manera aleatoria. 
 * 
 * @author RAFA
 *
 */
public class HornoCombinado implements GeneradorDeDulces{

	@Override
	public Dulce cocinarDulce() {
		int numeroAleatorio=(int)(Math.random()*10);
		Dulce dulce;
		switch(numeroAleatorio) {
		case 0,1,2,3: dulce=new Croissant();
		break;
		case 4,5,6,7: dulce= new Magdalena();
		break;
		case 8,9,10: dulce= new Tarta();
		break;
		default: dulce=null;
		}
		return dulce;
	}

}
