numbers = [1, 2, 3, 4, 5];

// looping through the array for the temporary variable
// let variable expects it to be mutable
// let variables are block scoped - can only be seen inside the block that they are created (curly braces)

let numberToPrint = 0;

for(let number of numbers){
    numberToPrint = number;
    console.log("value of numberToPrint inside loop: ", numberToPrint);
}

const functionName = function(){
    return null;
}
// accessing it outside the variable (let variable) it will cause an error
console.log("value of numberToPrint outside loop: ", numberToPrint);

const song = {
    title: "9 to 5",
    perfomer: "Dolly Parton"
};

song.title = "Jolene";

console.log(song);

// -- var - function scoped --
// soft deprecated
// var === let (block scoped) 

const myFunction = () => {
    if(true){
        var aVarVariable = "will print because var has function scope";
        let aLetVariable = "will not print because let is block scoped";
    }
    console.log(aVarVariable); // will work
    console.log(aLetVariable); // will not work
}

// myFunction ();