shoppingList = ["milk", "eggs", "tea", "apples"];

// -- for..of --
// for(item of shoppingList) {
//     console.log(item.toUpperCase()); // the temporay variable is item
// }

// -- Classic for loop --
// for(i = 0; i < shoppingList.length; i ++ ){
//     console.log(shoppingList[i]);
// }

// -- While loop --
// counter = 0;

// while(counter < 10){
//     counter++;
//     console.log(counter);
// }

// while(true){
//     rand = Math.random();
//     console.log(rand);
//     if(rand > 0.8){
//         break;
//     }
// }

// -- Looping over objects --
// -- for..in --
tea = {
    name: "yorkshire",
    manufacturer: "Yalors of Harrogate",
    caffeine: true
};

for (key in tea){
    value = tea[key];
    console.log(`The ${key} is ${value}`); //string intrepalation - with back ticks
}