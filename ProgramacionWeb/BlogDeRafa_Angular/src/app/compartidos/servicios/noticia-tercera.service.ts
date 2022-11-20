import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NoticiaTerceraService {
  constructor(private http: HttpClient) { }

  
  public getNoticias(): Observable<any> {
    const URL = 'https://newsapi.org/v2/top-headlines?country=gb&category=business&apiKey=588731edf7b04824ac9df4e3016d0d76';

    return this.http.get(URL);
  }
}