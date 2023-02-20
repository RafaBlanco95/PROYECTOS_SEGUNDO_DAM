import React from 'react'
import {Link} from "wouter"
import './Footer.css'

export default function Footer(){
    return <div class="footer-basic bg-primary">
    <footer>
        <div class="social"><a href="https://www.linkedin.com/in/rafael-blanco-aranda-56676960/"><i class="fa-brands fa-linkedin"></i></a><a href="https://www.instagram.com/"><i class="fa-brands fa-instagram"></i></a><a href="https://twitter.com/"><i class="fa-brands fa-twitter"></i></a><a href="https://es-es.facebook.com/"><i class="fa-brands fa-facebook"></i></a></div>
        <ul class="list-inline">
            <li class="list-inline-item text-light"><Link to="/">Inicio</Link></li>
            <li class="list-inline-item text-light"><Link to="/nosotros">About Us</Link></li>
            <li class="list-inline-item text-light"><Link to="/gif/paises">Países</Link></li>
            <li class="list-inline-item text-light"><Link to="/gif/animales">Animales</Link></li>
            <li class="list-inline-item text-light"><Link to="/gif/comida">Comida</Link></li>
        </ul>
      </footer>
      <p class="copyright text-black bg-light"> <i class="fa-brands fa-react"></i> <b> GIF World © 2023</b><i class="fa-brands fa-react"></i></p>
      </div>
}
