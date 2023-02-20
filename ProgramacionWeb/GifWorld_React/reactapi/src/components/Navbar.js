import React from 'react'
import {Link} from "wouter"

export default function Navbar(){
    return <div className="App">
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
      <div class="container-fluid">
        <Link class="navbar-brand" to="/">GIF World <i class="fa-solid fa-earth-americas"></i></Link>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarColor01">
          <ul class="navbar-nav me-auto">
            <li class="nav-item">
              <Link class="nav-link active" to="/">Inicio
                <span class="visually-hidden">(current)</span>
              </Link>
            </li>
            <li class="nav-item">
              <Link class="nav-link" to='/nosotros'>About Us</Link>
            </li>
            <li class="nav-item dropdown">
              <Link class="nav-link dropdown-toggle" data-bs-toggle="dropdown" to="#" role="button" aria-haspopup="true" aria-expanded="false">Países</Link>
              <div class="dropdown-menu">
                <Link class="dropdown-item" to="/gif/españa">España</Link>
                <Link class="dropdown-item" to="/gif/portugal">Portugal</Link>
                <Link class="dropdown-item" to="/gif/italia">Italia</Link>
               
              </div>
            </li>
            <li class="nav-item dropdown">
              <Link class="nav-link dropdown-toggle" data-bs-toggle="dropdown" to="#" role="button" aria-haspopup="true" aria-expanded="false">Animales</Link>
              <div class="dropdown-menu">
                <Link class="dropdown-item" to='/gif/perro'>Perros</Link>
                <Link class="dropdown-item" to='/gif/gato'>Gatos</Link>
                <Link class="dropdown-item" to='/gif/panda'>Pandas</Link>
                <Link class="dropdown-item" to='/gif/mapache'>Mapaches</Link>
              </div>
            </li>
            <li class="nav-item dropdown">
              <Link class="nav-link dropdown-toggle" data-bs-toggle="dropdown" to="#" role="button" aria-haspopup="true" aria-expanded="false">Comida</Link>
              <div class="dropdown-menu">
                <Link class="dropdown-item" to='/gif/pizza'>Pizza</Link>
                <Link class="dropdown-item" to='/gif/hamburguesa'>Hamburguesa</Link>
                <Link class="dropdown-item" to='/gif/tarta'>Tarta</Link>
                <Link class="dropdown-item" to='/gif/galleta'>Galletas</Link>
              </div>
            </li>
          </ul>
          
      
     

    <div >
      
      <ul class="navbar-nav">
        <li class="nav-item">
          <Link class="nav-link acceso" to="/login" id="acceso"> <i class="fa-solid fa-user"></i> Inicio de
            Sesión</Link>
        </li>
        
      </ul>
    </div>
        </div>
      </div>

    </nav>
    </div>
}