import './App.css';
import Hello from './components/Hello.js';
import FruitList from './components/FruitList';

function App() {
  return (
    <>
    <Hello/>
    <FruitList/>
    </>
  );
  // for creating a class in js you have to use className
  // labels have the FOR keyword you can use htmlFor instead of className
}

export default App;
