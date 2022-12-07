import { Component, OnInit } from '@angular/core';
import { EntradaTienda } from 'src/app/compartidos/interfaces/entrada-tienda';
import { TiendaService } from 'src/app/compartidos/servicios/tienda.service';

@Component({
  selector: 'app-tiendas',
  templateUrl: './tiendas.component.html',
  styleUrls: ['./tiendas.component.css']
})
export class TiendasComponent implements OnInit {
  listaEntradaTiendas: EntradaTienda[];
  constructor(private tiendaService: TiendaService) { 
    this.listaEntradaTiendas=[]
    
  }

  public buscarTiendas(){
    let ids=[1,2,3,4,5,6,7,8,9,11];
    for(let i=0;i<ids.length;i++){
      this.tiendaService.getTiendas(ids[i]).subscribe(data =>{
        console.log(data)
        this.listaEntradaTiendas[i]=data;
      })
    }
    
  }
  ngOnInit(): void {
    this.buscarTiendas()
  }
}
