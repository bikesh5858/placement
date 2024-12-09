package Basic;

import java.util.Scanner;

class Bikesh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        try {
            System.out.print("Enter a string: ");
            String str = sc.nextLine(); // reads string
            System.out.print("You have entered: " + str);
        } finally {
            sc.close(); // close the scanner to avoid resource leaks
        }
    }
}
