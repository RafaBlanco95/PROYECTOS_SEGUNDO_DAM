const apiKey='1XJeAscB7LPEdHtF9FXpz55m2mJgQ8Li'

export default function getGifs({keyword='panda'}={}){
    const apiURL=`https://api.giphy.com/v1/gifs/search?api_key=${apiKey}&q=${keyword}&limit=25&offset=0&rating=g&lang=en`
   return fetch(apiURL)
    .then(res=>res.json())
    .then(response => {
      const{data=[]}=response
      const gifs=data.map(image=>{
        const{images,title,id}=image
        const{url}=images.downsized_medium
        return {title, id,url}
    })
      
      return gifs
    })
}