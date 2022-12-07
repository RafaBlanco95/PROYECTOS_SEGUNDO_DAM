import { Component, Input, OnInit } from '@angular/core';
import { EntradaJuego } from 'src/app/compartidos/interfaces/entrada-juego';

@Component({
  selector: 'app-entrada-juegos',
  templateUrl: './entrada-juegos.component.html',
  styleUrls: ['./entrada-juegos.component.css']
})
export class EntradaJuegosComponent implements OnInit {
  @Input()
  public entradaJuego:EntradaJuego;

  constructor() { 
    this.entradaJuego = {
    
    name:"",
    released:"",
    rating:0,
    background_image:""
    }
  }
  ngOnInit(): void {
  }

}
