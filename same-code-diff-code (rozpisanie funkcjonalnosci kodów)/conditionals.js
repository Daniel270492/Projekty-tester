
// JavaScript Conditional Statements
let score = 85;

if (score > 90) 
{
  console.log("Grade A");
} 
else if (score > 75) 
{
  console.log("Grade B");
} 
else 
{
  console.log("Grade C or below");
}

// Switch statement (not directly comparable to if-else but included for completeness)
let grade = 'B';
// utworzenie switch wraz z podaniem parametru w nawiasie
switch (grade) {
  case 'A': // porównywanie parametru z A
    console.log("Excellent"); // wyświetlenie na konsolę "Excellent"
    break;
  case 'B': // porównanie parametru z B
    console.log("Good"); // wyświetlenie na konsolę "Good"
    break;
  case 'C': // porównanie parametru z C
    console.log("Fair"); // wyświetlenie na konsolę "Fair"
    break;
  default: // wykonanie jeśli żadnen z "case" nie będzie równy parametrowi w switch
    console.log("Poor"); // wyświetlenie na konsolę "Poor"
    break;
}

let wiek = 17;
if(wiek >= 18){
  console.log("Możesz kupić alkohol");
}
else {
  console.log("Nie możesz kupić alkoholu");
}

let slowo = "nic";

// W JS aby porównać 2 stringi tosuje się operator === lub ==. 
// Operator === sprawdza zarówno wartość, jak i typ danych, podczas gdy operator == sprawdza tylko wartość, niezależnie od typu danych.
if(slowo === "Nic"){
  console.log("jest ok");
}
else {
  console.log("nie jest");
}
