
// JavaScript Data Structures
let numbers = [1, 2, 3, 4, 5]; // Array

// W odróżnieniu od python, klucze nie są zapisane jako String > nie są zapisane w "" 
let person = {
  firstName: "John",
  lastName: "Doe",
  age: 30
}; // Object

// w JS aby wywołać konkretny klucz, najpierw piszemy nazwę słownika
// person > nazwa słownika
// potem po "." piszemy o który klucz nam chodzi
// kluczem tutaj jest firstName
console.log(person.firstName); // Accesses and displays the firstName property of the person object


console.log(numbers); // Displays the array
console.log(numbers[0]) // Wyświetlenie 1 elementu tablicy, w tablicy 1 element ma indeks 0
console.log(numbers[1]) // Wyświetlenie 2 elementu tablicy

// przypisanie nowej wartości (10) do 1 elementu w tablicy, czyli indeksu 0
numbers[0] = 10
console.log(numbers[0])