
// Java Functions
public class functions {
    public static void main(String[] args) {
        System.out.println(" ");

        greet("World"); // Invokes the greet method
        System.out.println(add(5, 3)); // Invokes the add method
    }

    // określenie modyfikatora dostępu
    // słowo static pozwala na wywołanie metody bez tworzenia obiektu klasy
    // określenie typu zwracanego
    // typ void nie zwraca wartości
    // nazwa metody i podanie jej parametrów w nawiasie
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }


    // określenie modyfikatora dostępu
    // słowo static pozwala na wywołanie metody bez tworzenia obiektu klasy
    // określenie typu zwracanego
    // typ zwracany to int. Jeśli typ zwracany w JAVA jest inny niż VOID
    // musimy użyć słowa kluczowego return
    public static int add(int a, int b) {
        return a + b;
    }
}
