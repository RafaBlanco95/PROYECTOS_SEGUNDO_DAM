import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TiendaService {


  constructor(private http: HttpClient) { }

  
  getTiendas(parametro:number): Observable<any> {
    const URL = 'https://api.rawg.io/api/stores/'+parametro+'?key=619dfbfb10fe4dfbbb866720911e62ac';

    return this.http.get(URL);
  }
}
