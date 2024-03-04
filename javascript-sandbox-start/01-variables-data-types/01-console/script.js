let name = "john"
let age = 30;

let person = {
    name: "Brad",
    age: 40
}

let newName = name;
newName = "Johnatan"
console.log(name, newName);

let newPerson = person;

newPerson.name = "Bradley"
console.log(person, newPerson);
