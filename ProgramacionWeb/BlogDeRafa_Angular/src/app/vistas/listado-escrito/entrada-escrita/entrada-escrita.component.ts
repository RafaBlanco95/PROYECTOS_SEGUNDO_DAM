import { Component, Input, OnInit } from '@angular/core';
import { EntradaEscrita } from 'src/app/compartidos/interfaces/entrada-escrita';

@Component({
  selector: 'app-entrada-escrita',
  templateUrl: './entrada-escrita.component.html',
  styleUrls: ['./entrada-escrita.component.css']
})
export class EntradaEscritaComponent implements OnInit {

  @Input()
  public entradaEscrita:EntradaEscrita;

  constructor() { 
    this.entradaEscrita={
      titulo:'',
      resumen:'',
    }
  }

  ngOnInit(): void {
  }

}


