import React, {useEffect,useState} from 'react'
import Gif from './Gif'
import getGifs from '../services/GetGifs'


export default function ListOfGifs({params}){
    const {keyword}=params
    const [gifs, setGifs]= useState([])

    useEffect(function(){
      getGifs({keyword}).then(gifs=>setGifs(gifs))
    },[keyword])

    return <div>
{
  
 gifs.map(singleGif => 
  
    <Gif 
        key={singleGif.id} 
        title={singleGif.title} 
        id={singleGif.id} 
        url={singleGif.url}
    />
      )
}
</div>
      
}