let x;

const name = "John"
const age = 30;

x = "Hello my name is " + name + " and i am " + age

//templates literal
x = `Hello, my name is ${name} and i am ${age}`

console.log(x);

//string properties and methids
const s = new String("Hello world")

y = typeof s;
//y = s.length;

//Access values by key
y = s[0]
y = s.__proto__;

y = s.toLocaleUpperCase()
y = s.toLocaleLowerCase()
y = s.charAt(1)

y = s.indexOf("w")
y = s.substring(0, 5)
y = s.substring(6)

y = s.slice(-11)

y = "     Hello   World!"

y = s.trim()

y = s.replace("world", "John")

y = s.includes("1w")

y = s.valueOf()
y = s.split(" ")


console.log(y);
