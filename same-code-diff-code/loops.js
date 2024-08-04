
// JavaScript Loops
// For loop
// W pętli for jako pierwszy człon tworzymy iterator dla pętli
// jako drugi człon określamy warunek logiczny pętli
// ostatnim członem jest zwiekszeie iteratora o i przez wpisanie i++
//i++ > ikrementacja
//i-- > dekrematacja
for (let i = 0; i < 5; i++) {
  // wyświetlanie wartosci zmiennej dla ekran
  console.log(i);
}

// While loop
// utworzenie zmiennej
let j = 0;
// słowo klucz 
while (j < 5) {
  // sprawdzeie warunku na samym początku
  console.log(j);
  // inkrementacja
  j++;
}

// Do-while loop
// utworzenie zmiennej 
let k = 0;
// słowo kluczowe do 
do {
  // wyświetlenie na konsole
  console.log(k);
  // inkrementacja
  k++;
  // na samym koncu petli do-while następuje sprawdzenie warunku
} while (k < 5);
