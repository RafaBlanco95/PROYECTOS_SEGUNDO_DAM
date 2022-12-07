import { Component, OnInit, Input } from '@angular/core';
import { EntradaCreadores } from 'src/app/compartidos/interfaces/entrada-creadores';

@Component({
  selector: 'app-entrada-creadores',
  templateUrl: './entrada-creadores.component.html',
  styleUrls: ['./entrada-creadores.component.css']
})
export class EntradaCreadoresComponent implements OnInit {

  @Input()
  public entradaCreador:EntradaCreadores;
  constructor() { 
    this.entradaCreador= {
    name:"",
    image:"",
    description:"",
    games_count:0,
    rating:""
    }
  }
  ngOnInit(): void {
  }

}
