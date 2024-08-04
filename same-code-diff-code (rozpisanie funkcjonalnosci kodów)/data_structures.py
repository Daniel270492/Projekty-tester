
# Python Data Structures
# deklaruje nazwę listy, 
# w nawiasach kwadratowych po przecinku wypisujemy elementy listy
numbers = [1, 2, 3, 4, 5] # List

# słownik tworzy strukturę klucz-wartość
# w momencie gdy zapytamy o konkretny klucz, w odpowiedzi otrzymamy jego wartość
person = {
  # ustanowienie pary klucz - wartość. Kolejne oddzielone są przecinkiem
  "firstName": "John",
  "lastName": "Doe",
  "age": 30
} # Dictionary


print(person["firstName"]) # Accesses and displays the firstName key of the person dictionary

print(numbers) # Displays the list
print(numbers[0]) # Wyświetlenie 1 elementu tablicy, w tablicy 1 element ma indeks 0
print(numbers[1]) # Wyświetlenie 2 elementu tablicy

# przypisanie nowej wartości (10) do 1 elementu w tablicy, czyli indeksu 0
numbers[0] = 10
print(numbers[0])