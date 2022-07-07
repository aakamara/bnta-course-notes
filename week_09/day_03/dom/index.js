const heading = document.querySelector('#main-heading');
// console.log(heading);

heading.innerText = "Cool Stuff I've learned about the DOM";

const paragraphs = document.querySelectorAll('.paragraph');
// console.log(paragraphs)
paragraphs[0].innerText = "The DOM is a hierarchical, object in your document representarion of the HTML elements in the document";
paragraphs[1].innerText = "It provides us with an API which allows us to traverse our HTML document, read data from it, and/or make changes to it";

document.querySelector('h2').innerHTML = "Important methods and properties";

const list = document.querySelector('.list');
// if you want to remove all elements
list.innerHTML = "";

// creates an empty element in memory - no content yet, and not added to page
const item1 = document.createElement('li');
console.log(item1);

// use innerText to assign content
item1.innerText = "querySelector() - select the first element that matches a CSS query";

// this adds the specified element as a child node
list.appendChild(item1);

const item2 = document.createElement("li");
item2.innerText = "querySelectorAll() - select all elements that match a query";

const item3 = document.createElement("li");
item3.innerText = "innerText - retrieve or set the text content of an element";

const item4 = document.createElement("li");
item4.innerText = "innerHTML - retrieve or set the inner html of an element, such as it's child elements (or nodes)";

const item5 = document.createElement("li");
item5.innerText = "convertToSpaceMonkey() - use your space monkey ray-gun to convert all elements to space-monkeys";
// use innerText to assign content
item1.innerText = "querySelector() - select the first element that matches a CSS query";

// now that we've created or new li elements, we must add them as children to the ul element using appendChild()
list.appendChild(item1); list.appendChild(item2); list.appendChild(item3); list.appendChild(item4); list.appendChild(item5);

// to surgically remove an elemet, use the removeChild method
list.removeChild(list.lastChild);

const box = document.getElementById('box');
box.innerHTML = "<ul><li>Hello</li><li>World</li></ul>"
