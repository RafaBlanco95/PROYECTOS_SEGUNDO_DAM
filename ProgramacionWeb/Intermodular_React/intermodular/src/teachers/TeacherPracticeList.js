import React, { useEffect, useState } from 'react'
import axios from "axios"
import { Link, useParams } from 'react-router-dom';

export default function TeacherPracticeList() {

    const [practices, setPractices] = useState([]);

    const {id}=useParams()

    useEffect(() => {
        loadPractices();
    }, []);

    const loadPractices = async () => {
        const result = await axios.get("http://localhost:8886/api/practicas");
        setPractices(result.data);
    };

    
  
    return (
        <div className="container">
            <div className="py-4">
                <h3 className='mb-3'><b>Listado de Prácticas</b></h3>

                <table class="table shadow">
                    <thead>
                        <tr class="table-primary">
                            <th scope="col">Código de Pactica</th>
                            <th scope="col">Titulo</th>
                            <th scope="col">Dificultad</th>
                            <th scope="col">Acciones</th>

                        </tr>
                    </thead>
                    <tbody>
                        {
                            practices.map((practice, index) => (
                                <tr>
                                    <th scope="row" key={index}>{practice.codigoPractica}</th>
                                    <td>{practice.titulo}</td>
                                    <td>{practice.dificultad}</td>
                                    <td>
                                        <Link className="btn btn-primary mx-2" to={`/teachers/${id}/asignpractice/${practice.codigoPractica}`}>Registrar Resultado</Link>
                                       
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
