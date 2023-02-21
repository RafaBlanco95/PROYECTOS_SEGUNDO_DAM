import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'


export default function ViewStudent() {

    const [student,setStudent]=useState({
        matricula:"",
        nombre:"",
        grupo:""
    })

    const {id}=useParams();

    useEffect(()=>{
        loadStudent()
    },[])

    const loadStudent=async()=>{
        const result=await axios.get(`http://localhost:8886/api/alumnos/${id}`)
        setStudent(result.data)
    }
    return (
        <div className="container">
            <div className='row'>
                <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
                    <h2 className='text-center m-4'>Ficha del Alumno</h2>
                    <div className='card'>
                        <div className='card-header'>
                            Ficha del Alumno con nº de matrícula:  
                            {student.matricula}
                            <ul className='list-group list-group-flush'>
                                <li className='list-group-item'>
                                    <b>Nombre: </b>
                                    {student.nombre}
                                </li>
                                <li className='list-group-item'>
                                    <b>Grupo: </b>
                                    {student.grupo}
                                </li>

                            </ul>
                        </div>
                    </div>
                    <Link className="btn btn-primary my-2" to={"/"}>Volver</Link>
                </div>
            </div>
        </div>
    )

}