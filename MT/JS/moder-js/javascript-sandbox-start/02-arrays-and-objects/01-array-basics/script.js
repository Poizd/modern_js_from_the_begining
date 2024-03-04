let x;

//Array literal
const numbers = [12, 34, 554, 23]

//Array Constructor
const fruits = new Array("apple", "grape", "orange")

x = numbers[0] + numbers[1]

x = `My favorut fruite is an ${fruits[0]}`

x = fruits.length

fruits[2] = "pear"

//fruits.length = 2

fruits[3] = "strawberry"
fruits[fruits.length] = "bluberry"
x = fruits

console.log(x);