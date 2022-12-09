import { Genero } from "./genero"

export interface EntradaJuego {
    name:string
    released:string
    rating:number
    background_image:string
    metacritic:number
    genres:Genero[]
}

