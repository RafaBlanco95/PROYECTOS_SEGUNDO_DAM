import { Component, OnInit } from '@angular/core';
import { NoticiaCuartaService } from 'src/app/compartidos/servicios/noticia-cuarta.service';
@Component({
  selector: 'app-listado-noticias-cuarto',
  templateUrl: './listado-noticias-cuarto.component.html',
  styleUrls: ['./listado-noticias-cuarto.component.css']
})
export class ListadoNoticiasCuartoComponent implements OnInit {
  listaNoticias: any[]=[];
  constructor(private noticiaSevice: NoticiaCuartaService) { }

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