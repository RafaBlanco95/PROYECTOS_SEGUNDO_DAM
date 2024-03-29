import React, { useState } from 'react'
import axios from 'axios';
import { Link, useNavigate } from 'react-router-dom';

export default function AddStudent() {

    let navigate = useNavigate()

    const [student, setStudent] = useState({
        nombre: "",
        grupo: ""
    });

    const { nombre, grupo } = student

    const onInputChange = (e) => {
        setStudent({ ...student, [e.target.name]: e.target.value })
    }

    const onSubmit = async (e) => {
        e.preventDefault();
        await axios.post("http://localhost:8886/api/alumnos/nuevo", student)
        navigate("/students")
    }

    return (
        <div className="container">
            <div className='row'>
                <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
                    <h2 className='text-center m-4'>Matricular Nuevo Alumno</h2>
                    <form onSubmit={(e) => onSubmit(e)}>
                        <div className='mb-3'>
                            <label htmlFor='nombre' className='form-label'>
                                Nombre
                            </label>
                            <input type={"text"} className="form-control" placeholder='Nombre del Alumno' name="nombre" value={nombre} onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='grupo' className='form-label'>
                                Grupo
                            </label>
                            <input type={"text"} className="form-control" placeholder='Grupo del Alumno' name="grupo" value={grupo} onChange={(e) => onInputChange(e)} />
                        </div>
                        <button type="submit" className='btn btn-outline-primary'>Registrar</button>
                        <Link className='btn btn-outline-danger mx-2' to="/students">Cancelar</Link>
                    </form>
                </div>
            </div>
        </div>
    )
}
