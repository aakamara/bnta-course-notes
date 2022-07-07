import {useState, useRef} from "react"; 
import React from 'react';

const AddRecipe = ({recipes, setRecipes}) => {
    const inputNameRef = useRef();
    const inputIngredientRef = useRef();
    const inputRatingRef = useRef();


    const handleAddRecipe = (event) => {
        event.preventDefault()
        const name = inputNameRef.current.value;
        const ingredientsString = inputIngredientRef.current.value;
        const ingredientsArray=ingredientsString.split(",")
        const rating = inputRatingRef.current.value;
        console.log(name);
        console.log(ingredientsArray);
        console.log(rating);
        setRecipes(prevRecipes => [...prevRecipes, {cakeName: name, ingredients: ingredientsArray, rating: rating}])
        console.log(recipes);
        
    }
    
    return(
        
        <form>
        <input ref={inputNameRef} placeholder="Name" type="text"></input><br/>
        <input ref={inputIngredientRef} placeholder="Ingredients" type="text"></input><br/>
        <input ref={inputRatingRef} placeholder="Rating" type="text"></input><br/>
        <button onClick={handleAddRecipe}>Submit</button>
        </form>   
    )
}

export default AddRecipe;