// --- Named functions ---

const greeting = greet("morning", "Richard"); //calling a method
// greet("afternoon", "Bell", "extra argument");
console.log(greeting);

//hoisting 
// The interpreter scans through the file to discover which variable names and 
// function names are present in the program and "hoists" them to the top of the file

function greet(timeOfDay, name){
    return `Good ${timeOfDay}, ${name}`; // dollar sign and curly braces adds objects
}


// --- Anonymous functions --- are first order objects, these are very common

const sum = function(num1, num2){
    return num1 + num2;
}

let total = sum(1, 2);
console.log(total);
// they are not hoisted

// --- Arrow functions ---

const mutliply = (num1, num2) => {
    return num1 * num2;
}

const product = mutliply(2, 5);
console.log(product);

// the arrow function is the implicit return where we have to use the return keyword to 
// get information back from the function

const multiply2 = (num3, num4) => num3 * num4
const product2 = multiply2(3, 4);
console.log(product2);

// can do it this way where it lets us streamline the code but limits us to simple
// single line expressions