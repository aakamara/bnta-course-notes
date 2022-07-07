// the component should have a captial letter for convention 
import React from 'react'; 
// have to import react in order to use react

const Hello = () => {
// the js place
    const greetings = ["hello", "hola", "salut", "こんにちは"];
    let randomIndex = Math.floor(Math.random() * greetings.length);
    let randomGreeting = greetings[randomIndex];
    
    const asma = "Asma";
    const joe = "Joe";
    let name;
    randomGreeting === "こんにちは"? name = joe : name = asma;

    return(
        // react fragment <> </> any elements or mulitple elements
        // you do not need to wrap them in div
        // cannot add stylying to the fragements, you want to style it it must be a div
        <>
        <h1>Today's greeeting is:</h1>
        <h2>{randomGreeting + " " + name}</h2>
        </>
    )
}

export default Hello;