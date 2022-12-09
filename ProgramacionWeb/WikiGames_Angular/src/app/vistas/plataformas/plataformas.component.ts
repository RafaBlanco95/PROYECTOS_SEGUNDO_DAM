import { Component, OnInit } from '@angular/core';
import { PlataformaService } from 'src/app/compartidos/servicios/plataforma.service';
import{ EntradaPlataforma } from 'src/app/compartidos/interfaces/entrada-plataforma';

@Component({
  selector: 'app-plataformas',
  templateUrl: './plataformas.component.html',
  styleUrls: ['./plataformas.component.css']
})
export class PlataformasComponent implements OnInit {

  listaEntradaPlataformas: EntradaPlataforma[];
  constructor(private plataformaService: PlataformaService) { 
    this.listaEntradaPlataformas=[]
    
  }

  public buscarNoticias(){
    let ids=[4,1,18,7,3,21,8,9,5,6,14,80,16,15,17,19,10,11,105,83,24,43,26,79,49,55,41,166,28,31,23,22,25,34,46,50,167,107,119,117,74,106,111,112,77,12];
    for(let i=0;i<ids.length;i++){
      this.plataformaService.getPlataformas(ids[i]).subscribe(data =>{
        console.log(data)
        this.listaEntradaPlataformas[i]=data;
      })
    }
    
  }
  ngOnInit(): void {
    this.buscarNoticias()
  }

}
