
# Python Functions
# zaczynamy od słowa kluczowego def, potem idzie nazwa metody. W nawiasie podany jest parametr
# jest to funkcja parametrowa
def greet(name):
    # wyświetlenie słowa hello,
    # następnie przez + poza "" możemy łączyć zmienne/parametry ze sztywno wpisanem tekstem
    print("Hello, " + name + "!")

greet("World") # Invokes the greet function

# funkcja dwuparametrowa
def add(a, b):
    # słowo kluczowe return określa co ma zwracać funkcja!
    return a + b

# przez to, że metoda jest w print wynik jej działania zostanie wyświetlone na konsolę
# metoda add z dwoma parametrami została wywołana w print
print(add(5, 3)) # Invokes the add function
