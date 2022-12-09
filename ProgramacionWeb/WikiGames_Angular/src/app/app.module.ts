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
import { JuegosComponent } from './vistas/juegos/juegos.component';
import { EntradaJuegosComponent } from './vistas/juegos/entrada-juegos/entrada-juegos.component';
import { PlataformasComponent } from './vistas/plataformas/plataformas.component';
import { EntradaPlataformasComponent } from './vistas/plataformas/entrada-plataformas/entrada-plataformas.component';
import { TiendasComponent } from './vistas/tiendas/tiendas.component';
import { EntradaTiendasComponent } from './vistas/tiendas/entrada-tiendas/entrada-tiendas.component';
import { CreadoresComponent } from './vistas/creadores/creadores.component';
import { EntradaCreadoresComponent } from './vistas/creadores/entrada-creadores/entrada-creadores.component';
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
    JuegosComponent,
    EntradaJuegosComponent,
    PlataformasComponent,
    EntradaPlataformasComponent,
    TiendasComponent,
    EntradaTiendasComponent,
    CreadoresComponent,
    EntradaCreadoresComponent,
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
