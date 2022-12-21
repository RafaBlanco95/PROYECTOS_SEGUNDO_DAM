package com.nttdata;


import com.nttdata.dulces.Dulce;
import com.nttdata.hornos.HornoCombinado;
import com.nttdata.hornos.HornoCroissants;
import com.nttdata.hornos.HornoMagdalenas;
import com.nttdata.hornos.HornoTartas;

/**
 * 
 * Clase principal del obrador que permite demostrar el funcionamiento del patrón de diseño Factory
 * @author RAFA
 *
 */
public class ObradorPatronFactory {
	
	
	/**
	 * Método principal de la clase en el que se realizan las llamadas al resto de clases que componen el obrador
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**String Builder que permite mostrar por pantalla los ejemplos de forma más eficiente*/
		final StringBuilder sbu = new StringBuilder();
		
		sbu.append("---------------------------------------------------------------------------------------------------------------------------------------------\n");
		sbu.append("En función de lo que pida el cliente se hará uso de un horno diferente, aunque todos los hornos son generadores de dulces. \n");
		sbu.append("Este polimorfismo nos ofrece claridad y encapsulación del código a la vez que evita problemas de acoplamiento de objetos a lo largo del mismo. \n");
		sbu.append("--------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
		sbu.append("Comienza el día en el obrador \"PatrónFactory\" y se encienden los hornos \n"); 
		
		//Inicialización de los generadores de dulces
		HornoCroissants hornoCroissants= new HornoCroissants();
		HornoMagdalenas hornoMagdalenas= new HornoMagdalenas();
		HornoTartas hornoTartas= new HornoTartas();
		HornoCombinado hornoGeneral= new HornoCombinado();
		
		sbu.append("\n\n");
		sbu.append("Cliente 1 \n");
		sbu.append("-Buenos días, quisiera un Croissant recién hecho, una Magdalena y un trozo de Tarta \n");
		sbu.append("-Por supuesto señor, enseguida se los preparo \n");
		
		//Generación de los dulces con su horno correspondiente
		Dulce dulce1Cliente1=hornoCroissants.cocinarDulce();
		Dulce dulce2Cliente1=hornoMagdalenas.cocinarDulce();
		Dulce dulce3Cliente1=hornoTartas.cocinarDulce();
		
		sbu.append("-Aquí tiene sus dulces (Le entrega 3 paquetitos) \n");
		sbu.append("-Pero, un momento ¿Cómo sé que hay dentro de cada envoltorio? \n");
		sbu.append("-Muy fácil, lo que ha salido de nuestro horno de Croissants es un Croissant, lo que ha salido de nuestro horno de Magdalenas, \n");
		sbu.append("es una Magdalena, y lo que ha salido de nuestro horno de Tartas, es un pedazo de Tarta. Además, si tiene dudas, puede consultar \n");
		sbu.append("su etiqueta \n");
		
		System.out.println(sbu);
		sbu.setLength(0);
		 
		dulce1Cliente1.etiqueta();
		dulce2Cliente1.etiqueta();
		dulce3Cliente1.etiqueta();
		
		sbu.append("\n\n");
		sbu.append("Cliente 2 \n");
		sbu.append("-Buenos días, a mi me gusta todo lo que hacéis, así que quiero que me des un dulce cualquiera \n");
		sbu.append("-Por supuesto señor, aquí tiene \n");
		
		Dulce dulceCliente2=hornoGeneral.cocinarDulce();
		
		sbu.append("-Oh vaya, parece que me ha tocado un " + dulceCliente2.getClass()+"\n");
		sbu.append("-Voy a comprobar que está correctamente etiquetado \n");
		
		System.out.println(sbu);
		
		dulceCliente2.etiqueta();
	}
	
}
