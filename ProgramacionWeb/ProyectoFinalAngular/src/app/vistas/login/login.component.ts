import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/compartidos/clases/usuario';
import { LoginService } from 'src/app/compartidos/servicios/login.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
  })
  export class LoginComponent implements OnInit {
  // Atributos
  public usuario: Usuario;
  constructor(private loginService: LoginService,private router:Router){
  this.usuario = new Usuario();
  }
  ngOnInit(): void {
  }
  public submit(): void {
  this.loginService.login(this.usuario).subscribe(
  (data: number) => {
  localStorage.setItem('nombreUsuario', this.usuario.nombre);
  localStorage.setItem('miTokenPersonal',`${ data }`);
  this.router.navigate(['/']);
  },
  (error: Error) => {
  console.error("Error al realizar el acceso");
  }
  )
  }
  }