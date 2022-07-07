import './App.css';
import TodoList from './TodoList';
import { useState, useRef, useEffect } from 'react'; // this is a hook example
import usePersistedState from './usePersistedState';

function App() {
  // (name, id)
  //  const[todos, setTodos] = useState(localStorage.getItem("tods")? JSON.parse(localStorage.getItem("todos")) : []);
  const[todos, setTodos] = usePersistedState(localStorage.getItem("tods")? JSON.parse(localStorage.getItem("todos")) : []);
  //  bad example: hardcode, brute-force approach, localStorage key: value based, localStorage only accepts strings, JSON.stringify, etc ..
  
  const [todoId, setTodoId] = useState(localStorage.getItem("todoId")? JSON.parse(localStorage.getItem("todoId")): 0);
  const inputValueRef = useRef();

/*
this approach creates infinite loop
  if(localStorage.getItem(`todos`)){
    setTodos((prev)=> JSON.parse(localStorage.getItem(`todos`)));
  } else{
    localStorage.setItem(`todos`, JSON.stringifu(todos));
  }
  */

  /*
  useEffect(()=>{
      localStorage.setItem(`todos`, JSON.stringify(todos));
  }, [todos]);

  */

  //  useEffect(()=>{
  //     localStorage.setItem(`todoId`, JSON.stringify(todoId));
  // }, [todoId]);
  


  const handleAddTodo = () => {
    // 1. read the data from the input field
    // 2. add it to our state
    const name = inputValueRef.current.value;
    if(name === "") return;
    // dont do it like this: not recommended
    // setTodos(()=>{return [...todos, {name: name, id: name}]})
    // do it like this:
    setTodos(prevTodos => [...prevTodos, {name: name, id: todoId}]);
    // don't attempt side-effects in this way, use useEffect instead: 
    // document.title = `${todos.length} todos`;
    setTodoId(id => id++);
    inputValueRef.current.value= "";
  }

useEffect(()=> {
  document.title = `${todos.length} todos left`;
})


const handleClearAll = (e) => {
  setTodos((prev)=>[]);
}

const removeTodo = (id) => {
  setTodos(prev=> prev.filter(todo => todo.id !== id));
}


  return ( // JSX
    <div className="App">
      <h1>Darth Vader's Todo List</h1>
      <p>I really must remember to ...</p>
      <hr />
        <TodoList todos={todos} removeTodo={removeTodo} />
      <hr />
      <input ref={inputValueRef} type="text"></input>
      <button onClick={handleAddTodo}>Add Todo</button>
      <button onClick={handleClearAll}>Clear All</button>
    </div>
  );
}

export default App;
