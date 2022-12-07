import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class JuegoService {

  constructor(private http: HttpClient) { }

  
  getJuegos(parametros: any): Observable<any> {
    const URL = 'https://api.rawg.io/api/games?key=619dfbfb10fe4dfbbb866720911e62ac&platforms='
      + parametros.plataforma + '&genres=' + parametros.genero ;

    return this.http.get(URL);
  }
}

