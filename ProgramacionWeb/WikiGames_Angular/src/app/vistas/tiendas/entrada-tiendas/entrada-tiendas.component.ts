import { Component, OnInit, Input } from '@angular/core';
import { EntradaTienda } from 'src/app/compartidos/interfaces/entrada-tienda';

@Component({
  selector: 'app-entrada-tiendas',
  templateUrl: './entrada-tiendas.component.html',
  styleUrls: ['./entrada-tiendas.component.css']
})
export class EntradaTiendasComponent implements OnInit {
  @Input()
  public entradaTienda:EntradaTienda;
  constructor() { 
    this.entradaTienda= {
    name:"",
    domain:"",
    games_count:0,
    image_background:"",
    description:""
    }
  }
  ngOnInit(): void {
  }

}
