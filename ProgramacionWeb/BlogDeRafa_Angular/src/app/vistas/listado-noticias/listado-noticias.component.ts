import { Component, OnInit } from '@angular/core';
import { NoticiaService } from 'src/app/compartidos/servicios/noticia.service';
@Component({
  selector: 'app-listado-noticias',
  templateUrl: './listado-noticias.component.html',
  styleUrls: ['./listado-noticias.component.css']
})
export class ListadoNoticiasComponent implements OnInit {

  listaNoticias: any[]=[];
  constructor(private noticiaSevice: NoticiaService) { }

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

