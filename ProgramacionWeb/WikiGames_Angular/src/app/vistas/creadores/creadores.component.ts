import { Component, OnInit } from '@angular/core';
import { EntradaCreadores } from 'src/app/compartidos/interfaces/entrada-creadores';
import { CreadoresService } from 'src/app/compartidos/servicios/creadores.service';

@Component({
  selector: 'app-creadores',
  templateUrl: './creadores.component.html',
  styleUrls: ['./creadores.component.css']
})
export class CreadoresComponent implements OnInit {
  listaEntradaCreadores: EntradaCreadores[];
  constructor(private creadorService: CreadoresService) { 
    this.listaEntradaCreadores=[]
    
  }

  public buscarCreadores(){
    let ids=[31,37,63,27630,70,3,72,28,26,3559];
    for(let i=0;i<ids.length;i++){
      this.creadorService.getCreadores(ids[i]).subscribe(data =>{
        console.log(data)
        this.listaEntradaCreadores[i]=data;
      })
    }
    
  }
  ngOnInit(): void {
    this.buscarCreadores()
  }
}
