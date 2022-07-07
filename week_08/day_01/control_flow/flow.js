let number = 34;
let numberTwo = 28;

// === is 'strict equality, and checks dataype as well as value'
// == is standard equality. Does not check datatype.
if(number === numberTwo){
    console.group(number + " is the same as " + numberTwo + "!!");
}
else if (number < numberTwo) {
    console.group(number + " is less than " + numberTwo + "!!");
}
else if (number > numberTwo){
    console.group(number + " is greater than " + numberTwo + "!!");
}
else {
    console.group(number + " is NOT the same as " + numberTwo + " :( ");
}

// object literal to be used as a 'lookup' - similar to an enum
const Weekday = {
    MONDAY: 1,
    TUESDAY: 2,
    WEDNESDAY: 3,
    THURSDAY: 4,
    FRIDAY: 5,
    SATURDAY: 6,
    SUNDAY:7
}

// console.group(Weekday);
//using colons and not semicolons
const day = Weekday.THURSDAY;

switch(day) {
    case Weekday.MONDAY:
    case Weekday.TUESDAY:
    case Weekday.WEDNESDAY:
    case Weekday.THURSDAY:
    case Weekday.FRIDAY:
        console.log("it's Monday!");
        break;
    case Weekday.SATURDAY:
    case Weekday.SUNDAY:
        console.log("it's the weekend!");
}

//const means that the variable cannot be reassigned. However, the values inside of
// a const object or array can be changed - they're mutable
Weekday.MONDAY = "pixie dust";
    console.log(Weekday);
