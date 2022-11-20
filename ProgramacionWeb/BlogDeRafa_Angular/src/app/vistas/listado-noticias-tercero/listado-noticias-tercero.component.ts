import { Component, OnInit } from '@angular/core';
import { NoticiaTerceraService } from 'src/app/compartidos/servicios/noticia-tercera.service';
@Component({
  selector: 'app-listado-noticias-tercero',
  templateUrl: './listado-noticias-tercero.component.html',
  styleUrls: ['./listado-noticias-tercero.component.css']
})
export class ListadoNoticiasTerceroComponent implements OnInit {
  listaNoticias: any[]=[];
  constructor(private noticiaSevice: NoticiaTerceraService) { }

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
