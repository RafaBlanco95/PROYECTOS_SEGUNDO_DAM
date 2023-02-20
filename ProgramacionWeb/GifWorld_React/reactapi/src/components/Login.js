import React from 'react'
import './Login.css'

export default function Login(){
    return <div class="container" id="contenedor-top">
    <div class="row">
    <div class="col-6">
      <div class="row border-bottom border-primary justify-content-center text-center" >
        <div class="col ">
          <span>
            <h1><b>Formulario de Inicio de Sesión </b></h1>
          </span>
        </div>
      </div>
      <div class="container">
        <form>
          <fieldset>
            <div class="form-group">
              <label for="nombre" class="form-label mt-4 "><h2><b>Usuario</b></h2></label>
              <input type="text" class="form-control " name="nombre" required aria-describedby="emailHelp" placeholder="Insertar Usuario"/>
              <small id="emailHelp" class="form-text "><b>El nombre de usuario será visible en el menú de
                navegación.</b></small>
            </div>
            <div class="form-group">
              <label for="contrasegna" class="form-label mt-4"><h2><b>Contraseña</b></h2></label>
              <input type="password" class="form-control"name="contrasegna"
                 required minlength="4" placeholder="Insertar Contraseña"/>
            </div>
            <small id="emailHelp" class="form-text mb-3"><b>La contraseña debe tener como mínimo 4
              dígitos.</b></small><br />
            <button type="submit"
              class="btn btn-primary mb-5">Acceder</button>
          </fieldset>
        </form>
      </div>
    </div>
    <div class="col-6">
      <img src="/formulario2.png" class="img-fluid" alt="..."/>
    </div>
  </div>
  </div>
}