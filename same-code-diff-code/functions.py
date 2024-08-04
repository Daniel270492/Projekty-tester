
# Python Functions
# zaczynamy od słowa kluczowego def , potem idzie nazwa metody . w nawiasie podany jesty parametr
# jest to funkcja parametrowa
def greet(name):
    # wyświetlenie słowa hello
    # nastepnie przez + poza "" mozemy laczyc parametry ze sztywno wpisanym tekstem
    print("Hello, " + name + "!")

greet("World") # Invokes the greet function

# funkcja dwuparametrowa
def add(a, b):
    # slowo kluczowe return okresla co ma zwracac funkcja
    return a + b
# przez to metoda jest w print wynik jej dzialania zostanie wyswietlony na konsiole
# metoda add z dwoma parametrami zostala wywolana w print
print(add(5, 3)) # Invokes the add function
