package list;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Iterating (snapshot behavior)
        System.out.println("Original List:");
        for (String fruit : list) {
            System.out.println(fruit);

            // Concurrent modification
            if (fruit.equals("Banana")) {
                list.add("Date"); // This won't affect the current iteration
            }
        }

        System.out.println("\nModified List:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

