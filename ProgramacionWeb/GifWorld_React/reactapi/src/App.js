import React from 'react';
import './App.css';
import ListOfGifs from './components/ListOfGifs';
import {Route} from "wouter"
import Navbar from './components/Navbar';
import Footer from './components/Footer';
import Inicio from './components/Inicio';
import Login from './components/Login'
import AboutUs from './components/AboutUs';

export default function App() {
  
  return (<>
    <Navbar />
    
    <section>
      <Route
        component={ListOfGifs}
        path="/gif/:keyword" />
      <Route 
        component={Inicio}
        path="/"/>
      <Route 
        component={AboutUs}
        path="/nosotros"/>
      <Route 
        component={Login}
        path="/login"/>
    </section>
    <Footer/>
    </>
    


  );
}


