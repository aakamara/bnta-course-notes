
// Hello Amber 👋, thought this might help on catching up on todays lesson.
// dw, this was fun to make and helped me understand the code too 🤓 !!

//PART 1: Using fetch() 

// fetch ()

window.addEventListener('DOMContentLoaded', () => { // apparently, we found out towards the end that we don't need wrap our 
    // code in this function for it to run in the console in chrome, so go ahead and comment line 9 and line 20, will work perf still
    console.log("DOM Conetent Loaded..."); // this line is not important, we just logged it to see if it will pop in console and that html and js are linked!

    const fetchDogImage = () => { // you give the function a name
        const request = fetch("https://dog.ceo/api/breeds/image/random") // this URL we copied from this website: (https://dog.ceo/dog-api/) because we're using an external API database
        .then(response => response.json()) // this line we just gotta memorise at this point because from what I see, it's used regularly in code
        .then(data => document.querySelector("img").src = data.message) // .message will print the 
    }

    document.querySelector("button").addEventListener("click", fetchDogImage);
})


// Thats it, part 1 is short, we coded to see if we can use fetch() to return images from an external API databse


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Go to this website: https://developer.mozilla.org/en-US/docs/Web/API/Response

// scroll down to *Methods* and then go on *response.json()* to understand better!

// hope this helps 👩‍💻



