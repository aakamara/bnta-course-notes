"use strict";

const sum = (...args) => { // rest parameter is ... when used in the definition of function signature
    let total = 0;
    for (let num of args){
        total += num;
    }
    return total;
}

const product = (...args) => {
    let total = 1;
    for (let num of args){
        total *= num;
    }
    return total;
}

// passing a variable but you don't have to do this
// module.exports = {sum: sum, product: product};
module.exports = {sum, product};