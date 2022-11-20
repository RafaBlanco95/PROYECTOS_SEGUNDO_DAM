import { Component, Input, OnInit } from '@angular/core';
import { EntradaApiJson } from 'src/app/compartidos/interfaces/entrada-api-json';

@Component({
  selector: 'app-entrada-api-json',
  templateUrl: './entradaApiJson.component.html',
  styleUrls: ['./entradaApiJson.component.css']
})
export class EntradaApiJsonComponent implements OnInit {

  @Input()
  public entradaApiJson:EntradaApiJson;

  constructor() {
    this.entradaApiJson = {
    title: '',
    body: '',
    id: 1,
    userId: 1
    }
    }

  ngOnInit(): void {
  }

}
