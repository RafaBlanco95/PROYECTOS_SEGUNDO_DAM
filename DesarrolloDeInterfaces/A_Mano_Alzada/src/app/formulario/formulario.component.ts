import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {
  @Output() parametrosSeleccionados = new EventEmitter<any>()

  plataformaSeleccionada = '4';
  generoSeleccionado = '2';

  plataformas: any[] = [
    { value: '4', nombre: 'Nacional'},
    { value: '2', nombre: 'Internacional'},
    { value: '18', nombre: 'Local'},
    { value: '7', nombre: 'Sociedad'},
    { value: '14', nombre: 'Economía'},
    { value: '16', nombre: 'Cultura'},
    { value: '19', nombre: 'Deportes'},
]

generos: any[] = [
  { value: '2', nombre: '2000-2005'},
  { value: '7', nombre: '2005-2010'},
  { value: '4', nombre: '2010-2015'},
  { value: '5', nombre: '2015-2020'},
  { value: '51', nombre: '2021'},
  { value: '83', nombre: '2022'},
  { value: '3', nombre: '2023'},
  
]

  constructor() { }

  ngOnInit(): void {
  }

  buscarNoticia() {
    const PARAMENTROS = {
      plataforma: this.plataformaSeleccionada,
      genero: this.generoSeleccionado
    }

    this.parametrosSeleccionados.emit(PARAMENTROS)

  }

}
