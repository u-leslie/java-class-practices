package collections;
import java.util.List;

public class Lists {
    public static void displayList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        // Example usage with a list of integers
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        System.out.println("Displaying List of Integers:");
        displayList(integerList);
        // Example usage with a list of doubles
        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("\nDisplaying List of Doubles:");
        displayList(doubleList);
        // You can use the displayList method with other types of lists as well
    }
}