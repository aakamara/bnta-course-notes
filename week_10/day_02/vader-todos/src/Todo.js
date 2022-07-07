/* const Todo = ({name, id, removeTodo}) => {
    return(
        // to use an invoked function, wrap it in an arrow function
        <li key={id}>{name} <button onClick={()=>{removeTodo(id)}}>Remove</button> </li>
    );    
} */

import React from "react";

class Todo extends React.Component{
     constructor(name, id, removeTodo){  // using the destructing syntax allos you to see what your proprs are at a glance
        super(name, id, removeTodo);
        //  state is handled by state proptery as object literal
        this.state = {
            foo: "bar"
        }
        // this.setState()
    }

    render(){
        return(
            <li key={this.props.id}>{this.props.name}<button onClick={()=> {this.props.removeTodo(this.props.id)}}>Remove</button></li>
        );
    }

}

export default Todo;