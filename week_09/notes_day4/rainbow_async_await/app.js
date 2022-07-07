//Part 2: Different ways to produce the same results from least desirable method to most desirable!!





// Right now, there is a lot of commented out sections, but first uncomment lines ( 11-36 ) and copy html path into chrome

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// // create a function called colourChange that takes in a newColour, nextColourChange

// const colourChange = (newColour, nextColourChange ) => {
//     setTimeout(() => { //setTimeout is a javaScript method that calls back a function (in this case is nextColourChange function) after a number of milliseconds
//         document.body.style.background = newColour; //body is the html body, style is the css function and you know what background is 
//         nextColourChange(); // if you comment this part out, you will see that it wont change to the next colour
//     }, 2000) // 2000 milliseconds is 2 seconds which is a time delay for when the next colour can show
// }

// // CALLBACK:
// colourChange('red', () => {
//     colourChange('orange', () => {
//         colourChange('yellow', () => {
//             colourChange('green', () => {
//                 colourChange('blue', () => {
//                     colourChange('violet', () => {

//                     })
//                 })
//             })
//         })
//     })
// })
// // RUN this in chrome and see the magic happen ✨✨
// // reason this manner of coding is not the best is because of that big traingular indentation that is forming between lines
// // 21 and 33

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Now, uncomment lines ( 41-58 ) and comment lines ( 11-36 )

// const colourChange = (newColour, nextColourChange ) => {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             document.body.style.backgroundColor = newColour;
//             resolve();
//         }, 2000)
//     })
// }

// //Chaning .thens
// colourChange('red')
// .then(() => colourChange('orange'))
// .then(() => colourChange('yellow'))
// .then(() => colourChange('green'))
// .then(() => colourChange('blue'))
// .then(() => colourChange('violet'))

// // use .then() when working with fetch but for other times, better to use async which we looked at next




//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Uncomment lines ( 67-87 ) and comment lines ( 41-58 )


// //ASYNC
// // lines 69 to 76 is exactly the same as lines 41 to 48, functions used to call colourChange is different
// const colourChange = (newColour, nextColourChange ) => {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             document.body.style.backgroundColor = newColour;
//             resolve();
//         }, 2000)
//     })
// }

// async function rainbow(){
//     await colourChange('red')
//     await colourChange('orange')
//     await colourChange('yellow')
//     await colourChange('green')
//     await colourChange('blue')
//     await colourChange('violet')
// }
// // have to call the method for it to run
// rainbow();

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// And there you have it 💁‍♀️ thats all there was to todays lesson! Hope this helps! 💅