
// JavaScript Loops
// For loop
// W pętli for jako 1 człon tworzymy iterator dla pętli 
// jako drugi człon określamy warunek logiczny pętli
// ostatnim członem jest zwiększenie iteratora o i przez wpisanie i++
// i++ > inkrementacja 
// i-- > dekrementacja
for (let i = 0; i < 5; i++) {
  // wyświetlenie wartości zmniennej dla ekran
  console.log(i);
}

// While loop
let j = 0;
while (j < 5) {
  console.log(j);
  j++;
}

// Do-while loop
// utworzenie zmiennej
let k = 0;
// słowo kluczowe do
do {
  // wyswietlenie na konsole
  console.log(k);
  // inkrementacja
  k++;
  // na samym końcu w pętli do-while następuje sprawdzenie warunku
} while (k < 5);