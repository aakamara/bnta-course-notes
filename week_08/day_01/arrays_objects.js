item1 = "milk";
item2 = "eggs";
item3 = "bread";
// ...
items93 = "apples";

emptyArray = [];
numbers = [1, 2, 3, 4, 5];
letters = ["a", "b", "c"];
// a code smell
// badIdea = [0 , "a", true, numbers, Math.PI];

shoppingList = [ "milk", "eggs", "bread"];
// arrays are mutable

shoppingList.push("apples");// takes the item that you want to add in
// the push method will push the length of the array to you


console.log("shoppingList: ", shoppingList); //type log then tag for autocompletion

// -- Adding an element to the end of the array -- 
    console.log("shoppingList length: ", shoppingList.length);
    //console.log("shoppingList length: ", shoppingListLength);

// -- Removing an element from the END of the array (POP) --
returnValue = shoppingList.pop();
console.log("returnedValue: ", returnValue);
console.log("shoppingList after pop(): ", shoppingList);

// -- Adding element to START of array (UNSHIFT) --
shoppingList.unshift("coffee");
console.log("shoppingList after unshift: ", shoppingList);

// -- Removing element from start of array (SHIFT) --
returnValue2 = shoppingList.shift();
console.log("shoppingList after shift: ", shoppingList);
console.log("returnValue from shift: ", returnValue2);

// -- Square bracket notation --
grocery1 = shoppingList[0];
console.log("item at index 0: ", grocery1);

grocery3 = shoppingList[2];
console.log("item at index 2: ", grocery3);

// -- OBJECTS --
//rules for objects: (1) cannot start with number, (2) unique within the object, (3) use meaningful names

alice = {
    name : "Alice",
    age: 25,
    favouriteColour: "blue"
}

bob = {
    name: "Bob",
    age: 25,
    favourtieColour: "yellow"
}

// -- Acessing values --
    //aliceFaveColour = alice.favouriteColour;
    // cannot use the dash (-) in dot notation 
    aliceFaveColour = alice["favouriteColour"]; //dynamically access a value using the square brackets
console.log("Alice fave colour: ", aliceFaveColour);

// -- Adding a new value to the object -
alice.occupation = "develoepr"; // can change the value using dot notation or square brackets
alice.occupation = "student";
console.log("Alice: ", alice);

