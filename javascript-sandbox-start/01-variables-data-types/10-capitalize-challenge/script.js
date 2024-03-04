// Create a new string called "myNewString" that holds the value of "Developer", using the value from "myString"
const myString = 'developer';

let myNewString = myString[0].toLocaleUpperCase() + myString.substring(1);

console.log(myNewString);