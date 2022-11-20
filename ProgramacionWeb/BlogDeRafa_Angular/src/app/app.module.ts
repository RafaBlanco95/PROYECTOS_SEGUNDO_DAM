import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BarraNavegacionComponent } from './barraNavegacion/barraNavegacion';
import { EntradaApiJsonComponent } from './vistas/listado-api-json/entrada-api-json/entradaApiJson.component';
import { ListadoApiJsonComponent } from './vistas/listado-api-json/listadoApiJson.component';
import { AppRoutingModule } from './app-routing.module';
import { PaginaNoEncontradaComponent } from './vistas/pagina-no-encontrada/pagina-no-encontrada.component';
import { AcercaDeNosotrosComponent } from './vistas/acerca-de-nosotros/acerca-de-nosotros.component';
import {HttpClientModule} from '@angular/common/http';
import { ListadoEscritoComponent } from './vistas/listado-escrito/listado-escrito.component';
import { EntradaEscritaComponent } from './vistas/listado-escrito/entrada-escrita/entrada-escrita.component';
import { InicioComponent } from './vistas/inicio/inicio.component';
import { ListadoClaseComponent } from './vistas/listado-clase/listado-clase.component';
import { EntradaClaseComponent } from './vistas/listado-clase/entrada-clase/entrada-clase.component';
import { ListadoNoticiasComponent } from './vistas/listado-noticias/listado-noticias.component';
import { ListadoNoticiasSegundoComponent } from './vistas/listado-noticias-segundo/listado-noticias-segundo.component';
import { ListadoNoticiasTerceroComponent } from './vistas/listado-noticias-tercero/listado-noticias-tercero.component';
import { ListadoNoticiasCuartoComponent } from './vistas/listado-noticias-cuarto/listado-noticias-cuarto.component';

@NgModule({
  declarations: [
    AppComponent,
    BarraNavegacionComponent,
    InicioComponent,
    ListadoApiJsonComponent,
    EntradaApiJsonComponent,
    PaginaNoEncontradaComponent,
    AcercaDeNosotrosComponent,
    ListadoEscritoComponent,
    EntradaEscritaComponent,
    ListadoClaseComponent,
    EntradaClaseComponent,
    ListadoNoticiasComponent,
    ListadoNoticiasSegundoComponent,
    ListadoNoticiasTerceroComponent,
    ListadoNoticiasCuartoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
