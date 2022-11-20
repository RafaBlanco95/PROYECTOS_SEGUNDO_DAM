import { Component, OnInit } from '@angular/core';
import { EntradaEscrita } from 'src/app/compartidos/interfaces/entrada-escrita';

@Component({
  selector: 'app-listado-escrito',
  templateUrl: './listado-escrito.component.html',
  styleUrls: ['./listado-escrito.component.css']
})
export class ListadoEscritoComponent implements OnInit {
  public listadoEntradasEscritas: EntradaEscrita[];
  
  constructor() {
    this.listadoEntradasEscritas = [
      {
        titulo: "4/7/1995 - Mi Nacimiento",
        resumen: " No lo recuerdo , pero me han dicho que lloraba mucho, que tenía mucho pelo y la cabeza grande  "
      },
      {
        titulo: "10/3/2006 -  La llegada de Pipo",
        resumen: "Adopción de la mascota de la familia, un Yorkshire Terrier de 3 meses precioso"
      },
      {
        titulo: "26/6/2017 -  Mi Graduación Universitaria",
        resumen: "Fin de la etapa universitaria que tanto daño provoca en las personas"
      },
    ];
  }

  ngOnInit(): void {

  }
  public mostrarTitulo(titulo: String): void {
    alert(`Entrada seleccionada:${titulo}.`)
  }

}

