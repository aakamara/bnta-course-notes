import './App.css';
import {BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';
import Home from './components/Home';
import About from './components/About';
import Services from './components/Services';
import Contact from './components/Contact';


function App() {
  return (
    <Router>
    <div className="App">
      <ul> 
        {/* Use the Link component to deinfe menus */}
        {/* control + option + down-arrow : duplicate
        option + down-arrow : move code */}
        <li><Link to='/'>Home</Link></li>
        <li><Link to='/about'>About</Link></li>
        <li><Link to='/services'>Services</Link></li>
        <li><Link to='contact'>Contact</Link></li>
      </ul>
      {/* Routes are defined with a path and an element */}
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/about' element={<About />} />
        <Route path='/services' element={<Services />} />
        <Route path='/contact' element={<Contact />} />
      </Routes>
    </div>
    </Router>
  );
}

export default App;
