//Chalenge 1 - mutate the following array to = the expected result below:
let x;

const arr = [1, 2, 3, 4, 5]

x = arr.push(6)
x = arr.unshift(0)
x = arr.reverse()

console.log(arr);

//Challenge 2
//Combine `arr1` and `arr2` into a new array called `arr3` with the following elements:
let arr3;

const arr1 = [1, 2, 3, 4, 5]
const arr2 = [5, 6, 7, 8, 9, 10]

//solution 1
//arr3 = arr1.slice(0, 4).concat(arr2)
//solution 2
//arr3 = arr1.splice(0, 4).concat(arr2)

//solution 2 rewritten
arr3 = [...arr1, ...arr2]
arr3.splice(4, 1)

console.log(arr3);