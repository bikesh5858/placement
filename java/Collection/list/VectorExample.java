package list;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        System.out.println("Vector elements: " + vector);

        // Access elements
        System.out.println("Element at index 1: " + vector.get(1));

        // Remove an element
        vector.remove("Banana");
        System.out.println("After removing 'Banana': " + vector);

        // Iterate through Vector
        System.out.println("Iterating through Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Check size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
    }
}

