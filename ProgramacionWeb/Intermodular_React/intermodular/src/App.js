
import './App.css';
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import{BrowserRouter as Router, Routes, Route} from "react-router-dom";
import AddStudent from './students/AddStudent';

function App() {
  return (
    
    <div className="App">
      <Router>
      <Navbar/>
      <Routes>
        <Route exact path="/" element={<Home/>}/>
        <Route exact path="/addstudent" element={<AddStudent/>}/>
      </Routes>
      </Router>
     
    </div>
  );
}

export default App;
