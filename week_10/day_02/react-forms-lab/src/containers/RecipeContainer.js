import {useState,useRef} from "react";
import RecipeList from "../components/RecipeList";
import AddRecipe from "../components/AddRecipe";
import React from 'react';

const RecipeContainer = () => {
    const [recipes, setRecipes] = useState([
        {
            cakeName: "Lemon Drizzle",
            ingredients: ["eggs", "butter", "lemon  zest", "sugar", "self-raising flour"],
            rating: 5
        },
        {
            cakeName: "Tea Loaf",
            ingredients: ["eggs", "oil", "dried fruit", "sugar", "self-raising flour", "strong tea"],
            rating: 3
        },
        {
            cakeName: "Brownie",
            ingredients: ["chocolate", "eggs", "flour", "butter", "walnuts"],
            rating: 4
        },
        {
            cakeName: "Carrot Cake",
            ingredients: ["carrots", "walnuts", "oil", "cream cheese", "flour", "sugar"],
            rating: 5
        }
      ]);


    return(
        <>
            <RecipeList recipes={recipes}/>
            <AddRecipe setRecipes={setRecipes} recipes={recipes}/>

        </>

    )
}

export default RecipeContainer;