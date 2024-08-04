
// Java Data Structures
import java.util.ArrayList;
import java.util.HashMap;

public class DataStructures {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1); numbers.add(2); numbers.add(3); numbers.add(4); numbers.add(5);
        HashMap<String, Object> person = new HashMap<String, Object>();
        person.put("firstName", "John");
        person.put("lastName", "Doe");
        person.put("age", 30);

        System.out.println(numbers); // Displays the ArrayList
        System.out.println(person.get("firstName")); // Accesses and displays the firstName key of the person HashMap
    }
}
