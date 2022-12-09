import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InicioComponent } from './vistas/inicio/inicio.component';
import { AcercaDeNosotrosComponent } from './vistas/acerca-de-nosotros/acerca-de-nosotros.component';
import { PaginaNoEncontradaComponent } from './vistas/pagina-no-encontrada/pagina-no-encontrada.component';
import { JuegosComponent } from './vistas/juegos/juegos.component';
import { PlataformasComponent } from './vistas/plataformas/plataformas.component';
import { TiendasComponent } from './vistas/tiendas/tiendas.component';
import { CreadoresComponent } from './vistas/creadores/creadores.component';
import { LoginComponent } from './vistas/login/login.component';
const routes: Routes = [
{ path: 'inicio', component: InicioComponent},
{ path: 'juegos', component: JuegosComponent},
{ path: 'plataformas', component: PlataformasComponent},
{ path: 'tiendas', component: TiendasComponent},
{ path: 'creadores', component: CreadoresComponent},
{ path: 'nosotres', component: AcercaDeNosotrosComponent},
{ path: 'login', component: LoginComponent},
{ path: '', redirectTo: '/inicio', pathMatch: 'full'},
{ path: '**', component: PaginaNoEncontradaComponent}
];
@NgModule({
exports: [RouterModule],
imports: [RouterModule.forRoot(routes)]
})
export class AppRoutingModule { }