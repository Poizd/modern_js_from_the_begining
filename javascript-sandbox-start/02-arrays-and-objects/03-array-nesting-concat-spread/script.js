let x;

const fruits = ["apple", "pear", "orange"]
const berries = ["strawberry", "blueberry", "rasberry"]

//fruits.push(berries)

//x = fruits[3][1]

const allFruits = [fruits, berries]

x = allFruits[1][0]

x = fruits.concat(berries)
//x = berries.concat(fruits)

//spread operator (...)

x = [...fruits, ...berries]

//Flatte
const arr = [1, 2, [3, 4], 5, [6, 7]]
x = arr.flat()

x = Array.from("12345")

const a = 1
const b = 2
const c = 3

x = Array.of(a, b, c)

console.log(x);