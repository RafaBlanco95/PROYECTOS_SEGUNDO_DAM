import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InicioComponent } from './vistas/inicio/inicio.component';
import { AcercaDeNosotrosComponent } from './vistas/acerca-de-nosotros/acerca-de-nosotros.component';
import { PaginaNoEncontradaComponent } from './vistas/pagina-no-encontrada/pagina-no-encontrada.component';
import { BuscadorComponent } from './vistas/buscador/buscador.component';
import { SeccionesComponent } from './vistas/secciones/secciones.component';
import { LoginComponent } from './vistas/login/login.component';
const routes: Routes = [
{ path: 'inicio', component: InicioComponent},
{ path: 'buscador', component: BuscadorComponent},
{ path: 'noticiasHoy', component: SeccionesComponent},
{ path: 'nosotros', component: AcercaDeNosotrosComponent},
{ path: 'login', component: LoginComponent},
{ path: '', redirectTo: '/inicio', pathMatch: 'full'},
{ path: '**', component: PaginaNoEncontradaComponent}
];
@NgModule({
exports: [RouterModule],
imports: [RouterModule.forRoot(routes)]
})
export class AppRoutingModule { }