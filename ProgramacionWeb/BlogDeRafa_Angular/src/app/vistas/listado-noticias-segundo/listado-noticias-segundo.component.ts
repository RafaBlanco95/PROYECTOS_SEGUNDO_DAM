import { Component, OnInit } from '@angular/core';
import { NoticiaSegundaService } from 'src/app/compartidos/servicios/noticia-segunda.service';
@Component({
  selector: 'app-listado-noticias-segundo',
  templateUrl: './listado-noticias-segundo.component.html',
  styleUrls: ['./listado-noticias-segundo.component.css']
})
export class ListadoNoticiasSegundoComponent implements OnInit {
  listaNoticias: any[]=[];
  constructor(private noticiaSevice: NoticiaSegundaService) { }

  public buscarNoticias(){
    this.noticiaSevice.getNoticias().subscribe(data =>{
      console.log(data)
      this.listaNoticias=data.articles;
    })
  }
  ngOnInit(): void {
    this.buscarNoticias();
  }
}

