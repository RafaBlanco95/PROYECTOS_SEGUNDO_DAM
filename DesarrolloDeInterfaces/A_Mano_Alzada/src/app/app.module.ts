import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { BarraNavegacionComponent } from './barraNavegacion/barraNavegacion';
import { AppRoutingModule } from './app-routing.module';
import { PaginaNoEncontradaComponent } from './vistas/pagina-no-encontrada/pagina-no-encontrada.component';
import { AcercaDeNosotrosComponent } from './vistas/acerca-de-nosotros/acerca-de-nosotros.component';
import {HttpClientModule} from '@angular/common/http';
import { InicioComponent } from './vistas/inicio/inicio.component';
import { FormularioComponent } from './formulario/formulario.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FooterComponent } from './footer/footer.component';
import { BuscadorComponent } from './vistas/buscador/buscador.component';
import { SeccionesComponent } from './vistas/secciones/secciones.component';
import { LoginComponent } from './vistas/login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    BarraNavegacionComponent,
    InicioComponent,
    PaginaNoEncontradaComponent,
    AcercaDeNosotrosComponent,
    FormularioComponent,
    FooterComponent,
    BuscadorComponent,
    SeccionesComponent,   
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
