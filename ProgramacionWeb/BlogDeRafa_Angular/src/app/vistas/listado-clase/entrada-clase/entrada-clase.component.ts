import { Component, Input, OnInit } from '@angular/core';
import { EntradaClase } from 'src/app/compartidos/interfaces/entrada-clase';
@Component({
  selector: 'app-entrada-clase',
  templateUrl: './entrada-clase.component.html',
  styleUrls: ['./entrada-clase.component.css']
})
export class EntradaClaseComponent implements OnInit {
  @Input()
  public entradaClase:EntradaClase;

  constructor() { 
    this.entradaClase={
      titulo:'',
      resumen:'',
    }
  }
  ngOnInit(): void {
  }

}
