import { Component, OnInit } from '@angular/core';
import { EntradaApiJson } from 'src/app/compartidos/interfaces/entrada-api-json';
import { EntradaService } from 'src/app/compartidos/servicios/entrada.service';


@Component({
  selector: 'app-listado-api-json',
  templateUrl: './listadoApiJson.component.html',
  styleUrls: ['./listadoApiJson.component.css']
})
export class ListadoApiJsonComponent implements OnInit {
  public listadoEntradasApiJson: EntradaApiJson[];
  
  constructor(private entradaService:EntradaService) {
    this.listadoEntradasApiJson = [];
  }

  ngOnInit(): void {
    this.recuperarEntradas();
  }
  public mostrarTitulo(title: String): void {
    alert(`Entrada seleccionada:${title}.`)
  }
  private recuperarEntradas(): void{
    this.entradaService.recuperarEntradas().subscribe(
    (data) => {
    this.listadoEntradasApiJson = data;
    },
    (error) => {
    console.log('Error: ', error);
    },
    () => {
    console.log('Petición realizada correctamente');
    }
    );
    }

}
