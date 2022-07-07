import Recipe from "./Recipe";
import React from 'react';

const RecipeList = ({recipes}) => {

    const recipeComponents = recipes.map((recipe,index) => {
        return <Recipe  key={index} 
                        recipe={recipe} />
    })
    return(
        <>
            {recipeComponents}
        </>
  )
}

export default RecipeList;