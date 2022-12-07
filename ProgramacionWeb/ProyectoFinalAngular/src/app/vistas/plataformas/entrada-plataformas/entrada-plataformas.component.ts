import { Component, OnInit, Input } from '@angular/core';
import { EntradaPlataforma } from 'src/app/compartidos/interfaces/entrada-plataforma';

@Component({
  selector: 'app-entrada-plataformas',
  templateUrl: './entrada-plataformas.component.html',
  styleUrls: ['./entrada-plataformas.component.css']
})
export class EntradaPlataformasComponent implements OnInit {
  @Input()
  public entradaPlataforma:EntradaPlataforma;
  constructor() { 
    this.entradaPlataforma = {
    name:"",
    games_count:0,
    image_background:"",
    description:""
    }
  }
  ngOnInit(): void {
  }

}
