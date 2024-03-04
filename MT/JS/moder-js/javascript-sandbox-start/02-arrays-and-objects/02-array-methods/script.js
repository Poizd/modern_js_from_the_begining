let x;
const arr = [34, 55, 95, 20, 15]

// arr.push(12123)
// arr.pop()

// arr.unshift(1)
// arr.shift()

// arr.reverse()

x = arr.includes(34)
x = arr.indexOf(123)

x = arr.slice(1, 4)
//x = arr.splice(1, 4)

//x = arr.splice(3, 1)

x = arr.splice(1, 4).reverse().toString().charAt()

console.log(x);