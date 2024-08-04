// Java Data Structures
import java.util.ArrayList;
import java.util.HashMap;

public class data_structures {
    public static void main(String[] args) {
        System.out.println(" ");

        int tablica[] = {1,2,3,0,0};
        System.out.println(tablica[0]);

        // po słowie arraylist w takich nawiasach <> definiujemy typ listy. Po =
        // jest jej nazwa ze słowen new i powtórzony typ
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // dodawanie kolejnych elementów do listy
        numbers.add(1); 
        numbers.add(2); 
        // aby dodać element do listy nie potrzebujemy informacji o który indeks nam chodzi. Przes wywołanie
        // add na liście, tworzony jest nowy indeks i zarem wypełniony jest podaną wartością.
        numbers.add(3); 
        numbers.add(4); 
        numbers.add(5);
        System.out.println(numbers); // Displays the ArrayList

        // aby odwołać się do konkretnego elementu w liście musimy na danej liście
        // czyli na jej nazwie(mówiąc fachowo na liście) użyć metody get(indeks_listy)
        // Tak jak w przypadku ADD metodę wywołujemy po kropce!
        System.out.println(numbers.get(0));
        
        // najpierw słowo HashMap, potem w nawiasach <> wpisujemy typy obiektów
        // po typach obiektów wpisujemy nazwę HashMap
        HashMap<String, Object> person = new HashMap<String, Object>();
        // na obiekcie mapy - obiekt mapy to person używamy metody
        // użycie metody to wywołanie metody na obiekcie przez napisanie ".COŚ" na obiekcie
        person.put("firstName", "John");
        // tutaj mamy uzupełnianie konkretnych kluczy, czyli 1 wyrażenia, konkretnymi wartościami, czyli 2 wyrażenie. Wyrażenia 
        // rozdzielone są przecinkiem
        person.put("lastName", "Doe");
        person.put("age", 30);

        // na obiekcie person używamy get czy pobranie wartości wskazanego klucza
        System.out.println(person.get("firstName")); // Accesses and displays the firstName key of the person HashMap
    }
}
