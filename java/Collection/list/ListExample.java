package list;
import java.util.LinkedList;

public class ListExample {
    public static class Contact {
        int id;
        String firstName;
        String lastName; 
        int phone;
        // Constructor
        Contact(int id, String firstName, String lastName, int phone) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.phone = phone;
        }
    }

    public static void main(String[] args) {
        LinkedList<Contact> list = new LinkedList<>();

        // Create Contact objects
        Contact c1 = new Contact(1, "Bikesh", "Kumar", 9863);
        Contact c2 = new Contact(2, "Hrishika", "Sah", 8428);

        // Add contacts to the list
        list.add(c1);
        list.add(c2);
        
        // Corrected the for loop type
        for (Contact c : list) {
            System.out.println("ID: " + c.id + ", First Name: " + c.firstName + ", Last Name: " + c.lastName + ", Phone: " + c.phone);
        }
    }
}
