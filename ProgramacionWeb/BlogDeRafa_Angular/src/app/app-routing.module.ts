import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InicioComponent } from './vistas/inicio/inicio.component';
import { ListadoApiJsonComponent } from './vistas/listado-api-json/listadoApiJson.component';
import { AcercaDeNosotrosComponent } from './vistas/acerca-de-nosotros/acerca-de-nosotros.component';
import { PaginaNoEncontradaComponent } from './vistas/pagina-no-encontrada/pagina-no-encontrada.component';
import { ListadoEscritoComponent } from './vistas/listado-escrito/listado-escrito.component';
import { ListadoClaseComponent } from './vistas/listado-clase/listado-clase.component';
import { ListadoNoticiasComponent } from './vistas/listado-noticias/listado-noticias.component';
import { ListadoNoticiasSegundoComponent } from './vistas/listado-noticias-segundo/listado-noticias-segundo.component';
import { ListadoNoticiasTerceroComponent } from './vistas/listado-noticias-tercero/listado-noticias-tercero.component';
import { ListadoNoticiasCuartoComponent } from './vistas/listado-noticias-cuarto/listado-noticias-cuarto.component';

const routes: Routes = [
{ path: 'inicio', component: InicioComponent},
{ path: 'listado-api-json', component: ListadoApiJsonComponent },
{ path: 'listado-escrito', component: ListadoEscritoComponent},
{ path: 'listado-clase', component: ListadoClaseComponent},
{ path: 'listado-noticias-ciencia', component: ListadoNoticiasComponent},
{ path: 'listado-noticias-deportes', component: ListadoNoticiasSegundoComponent},
{ path: 'listado-noticias-negocios', component: ListadoNoticiasTerceroComponent},
{ path: 'listado-noticias-salud', component: ListadoNoticiasCuartoComponent},
{ path: 'nosotres', component: AcercaDeNosotrosComponent},
{ path: '', redirectTo: '/inicio', pathMatch: 'full'},
{ path: '**', component: PaginaNoEncontradaComponent}
];
@NgModule({
exports: [RouterModule],
imports: [RouterModule.forRoot(routes)]
})
export class AppRoutingModule { }