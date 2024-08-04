
// JavaScript Functions
// słowo kluczowe function rozpoczyna tworzenie metody
function greet(name) {
  // na konsolę wyświetlamy napis, który używa parametru dostarczonego w metodzie
  console.log("Hello, " + name + "!");
}

greet("World"); // Invokes the greet function

// Arrow function with return value
const add = (a, b) => a + b;

function addSecond(a,b){
  return a+b;
}

console.log(add(5, 3)); // Invokes the add function
console.log(addSecond(5, 3)); // Invokes the add function