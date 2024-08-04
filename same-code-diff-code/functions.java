
// Java Functions
public class functions {
    public static void main(String[] args) {
        greet("World"); // Invokes the greet method
        System.out.println(add(5, 3)); // Invokes the add method
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
