import { Component, OnInit, Input } from '@angular/core';
import { JuegoService } from 'src/app/compartidos/servicios/juego.service';
import{ EntradaJuego } from 'src/app/compartidos/interfaces/entrada-juego';

@Component({
  selector: 'app-juegos',
  templateUrl: './juegos.component.html',
  styleUrls: ['./juegos.component.css']
})
export class JuegosComponent implements OnInit {
  @Input() listJuegos: any;
  listaEntradaJuegos: EntradaJuego[];
  constructor(private juegoService: JuegoService) { 
    this.listaEntradaJuegos=[]
  }

  public buscarJuegos(parametros:any){
    this.juegoService.getJuegos(parametros).subscribe(data =>{
      console.log(data)
      this.listaEntradaJuegos=data.results;
    })
  }
  ngOnInit(): void {
  }

}
