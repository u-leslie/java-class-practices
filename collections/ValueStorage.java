package collections;

import java.util.ArrayList;
import java.util.List;

public class ValueStorage {
    public static void main(String[] args) {
        // Create a List to store values
        List<Object> values = new ArrayList<>();

        // Store values (2, 4, "bonjour", 35) in the list
        values.add(2);
        values.add(4);
        values.add("bonjour");
        values.add(35);

        // Display values on the console
        System.out.println("Values stored in the list:");
        for (Object value : values) {
            System.out.println(value);
        }
    }
}
