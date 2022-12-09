import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-barraNavegacion',
  templateUrl: './barraNavegacion.component.html',
  styleUrls: ['./barraNavegacion.component.css']
})
export class BarraNavegacionComponent implements OnInit {

  public miToken: number;
  public nombreUsuario: string | null;
  constructor() {
  this.miToken = 0;
  this.nombreUsuario = "";
  }
  ngOnInit(): void {
  if (localStorage.getItem('miTokenPersonal')) {
  this.miToken = +localStorage.getItem('miTokenPersonal')!;
  }
  if (localStorage.getItem('miTokenPersonal')) {
  this.nombreUsuario = localStorage.getItem('nombreUsuario');
  }
  }
  public logout(): void {
  if (localStorage.getItem('miTokenPersonal')) {
  localStorage.removeItem('miTokenPersonal');
  }

  }
  public reload_page():void{
    window.location.reload();
  }
  }

