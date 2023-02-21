import React, { useEffect, useState } from 'react'
import axios from "axios"

export default function Home() {

    const [students, setStudents]=useState([]);

    useEffect(()=>{
        loadStudents();
    },[]);

    const loadStudents=async ()=>{
        const result= await axios.get("http://localhost:8886/api/alumnos");
        setStudents(result.data);
    };

  return (
    <div className="container">
        <div className="py-4">

<table class="table shadow">
  <thead>
    <tr class="table-primary">
      <th scope="col">Matrícula</th>
      <th scope="col">Nombre</th>
      <th scope="col">Grupo</th>
      <th scope="col">Acciones</th>
  
    </tr>
  </thead>
  <tbody>
{
    students.map((student,index)=>(
        <tr>
      <th scope="row" key={index}>{index+1}</th>
      <td>{student.nombre}</td>
      <td>{student.grupo}</td>
      <td> 
          <button className="btn btn-primary mx-2">Detalles</button>
          <button className="btn btn-outline-primary mx-2">Editar</button>
          <button className="btn btn-danger mx-2">Eliminar</button>
      </td>
    </tr>
    ))
}   
  </tbody>
</table>
        </div>

    </div>
  )
}
