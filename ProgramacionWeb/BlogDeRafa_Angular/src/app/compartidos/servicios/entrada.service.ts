import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';


@Injectable({
  providedIn: 'root'
})
export class EntradaService {

  constructor(private httpClient:HttpClient) { }

  public recuperarEntradas(): Observable<any> {
    return this.httpClient.get<any>('https://jsonplaceholder.typicode.com/posts');
    }
}
