import React from 'react'
import './Inicio.css'

export default function Inicio(){
    return<>
    <div class="container" id="contenedor-top">
    <h1>Bienvenido a GIF World</h1>
    <div class="card text-black bg-secondary border-primary mb-3 mt-3">
       
        <div class="card-body">
            <h4 class="card-title"><b>Toneladas de GIFs</b></h4>
            <p class="card-text">Repositorio con los mejores GIFs de diversas categorías</p>
        </div>
    </div>
    <div class="card text-white bg-primary mb-3 " >
            <div class="card-body">
                <h4 class="card-title"><b>La Web Más Optimizada</b></h4>
                <p class="card-text">No nos valía con hacer una web al uso, queríamos hacer una SPA con React aprovechando las herramientas disponibles</p>
            </div>
        </div>
        <div class="alert alert-dismissible alert-success mt-3">
  <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
  <strong>Profesores</strong>   <a href="/" class="alert-link">A continuación podéis evaluar el contenido de la web</a>.
</div>
      
      <table class="table table-hover">
  <thead>
    <tr class="table-dark">
      <th scope="col">Tecnología</th>
      <th scope="col">Alumno</th>
      <th scope="col">Nota</th>
    </tr>
  </thead>
  <tbody>
    <tr class="table-danger">
      <th scope="row">Angular</th>
      <td>Rafael Blanco Aranda</td>
      <td>10/10</td>

    </tr>
    <tr class="table-info">
    <th scope="row">React</th>
      <td>Rafael Blanco Aranda</td>
      <td>?/10</td>
    </tr>
   
  </tbody>
</table>
</div>
</>
    

    
}