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
    { value: '4', nombre: 'PC'},
    { value: '2', nombre: 'Xbox One'},
    { value: '18', nombre: 'PlayStation 4'},
    { value: '7', nombre: 'NintendoSwitch'},
    { value: '14', nombre: 'Xbox 360'},
    { value: '16', nombre: 'PlayStation 3'},
    { value: '19', nombre: 'PS Vita'},
]

generos: any[] = [
  { value: '2', nombre: 'Disparos'},
  { value: '7', nombre: 'Puzzles'},
  { value: '4', nombre: 'Acción'},
  { value: '5', nombre: 'RPG'},
  { value: '51', nombre: 'Indie'},
  { value: '83', nombre: 'Plataformas'},
  { value: '3', nombre: 'Aventuras'},
  { value: '1', nombre: 'Carreras'},
  { value: '15', nombre: 'Deportes'},
  { value: '59', nombre: 'Multijugador Masivo'},
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
