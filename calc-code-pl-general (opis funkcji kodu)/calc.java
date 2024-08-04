
// Java Simple Calculator
public class calc {
    // Klasa reprezentująca prosty kalkulator w języku Java


    public static void main(String[] args) {
        //Wyświetlenie rozpoczęcia wywołania działania metody
        
        System.out.println("Java Calculator");
        // Wyświetlenie nagłówka Java Calculator
                    
        System.out.println(addJava(10, 5));
        // Wyswietlenie wyniku dodawania wartosci 10 i 5

        System.out.println(subtractJava(10, 5));
        // Wyświetlenie wyniku odejmowania wartosci 10 i 5

         
            System.out.println(multiplyJava(10, 5));
        // Wyświetlenie wyniku mnożenia wartosci  10 i 5

       
         System.out.println(divideJava(10, 5))
        // Wyświetlenie wyniku dzielenia wartosci 10 przez 5
}

    
    // Dodawanie dwóch liczb całkowitych
public static int addJava(int a, int b) { return a + b; }

// Odejmowanie jednej liczby od drugiej
public static int subtractJava(int a, int b) { return a - b; }

// Mnożenie dwóch liczb całkowitych
public static int multiplyJava(int a, int b) { return a * b; }

// Dzielenie jednej liczby przez drugą
public static int divideJava(int a, int b) { return a / b; }

   

