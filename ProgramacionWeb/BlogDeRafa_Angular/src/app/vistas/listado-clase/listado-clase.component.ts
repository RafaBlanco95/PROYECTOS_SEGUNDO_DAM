import { Component, OnInit } from '@angular/core';
import { EntradaClase } from 'src/app/compartidos/interfaces/entrada-clase';
@Component({
  selector: 'app-listado-clase',
  templateUrl: './listado-clase.component.html',
  styleUrls: ['./listado-clase.component.css']
})
export class ListadoClaseComponent implements OnInit {
  
  public listadoEntradasClase: EntradaClase[];
  constructor() { 
  this.listadoEntradasClase = [
    {
      titulo: "Introducción a Angular",
      resumen: "En esta lección realizaremos una pequeña introducción al mundo de desarrollo con Angular "
    },
    {
      titulo: "TypeScript como lenguaje para Angular",
      resumen: "Breve recorrido por el lenguaje de TypeScript como base para desarrollar en Angular "
    },
    {
      titulo: "Componentes en Angular",
      resumen: "Aprenderemos a usar los componentes en Angular y el porqué de su importancia"
    },
  ];
}

ngOnInit(): void {

}
public mostrarTitulo(titulo: String): void {
  alert(`Entrada seleccionada:${titulo}.`)
}

}

