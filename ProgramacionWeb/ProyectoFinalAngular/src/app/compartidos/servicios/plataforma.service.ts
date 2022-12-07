import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlataformaService {

  constructor(private http: HttpClient) { }

  
  getPlataformas(parametro:number): Observable<any> {
    const URL = 'https://api.rawg.io/api/platforms/'+parametro+'?key=619dfbfb10fe4dfbbb866720911e62ac';

    return this.http.get(URL);
  }
}
