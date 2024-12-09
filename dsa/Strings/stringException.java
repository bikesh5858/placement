
import java.util.Scanner;
public class stringException{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word : ");
        String word1=sc.next();

        sc.nextLine(); // Consumes the newline left by sc.next()

        System.out.println("enter a line : ");
        String line = sc.nextLine();

        System.out.println(" word is  : "+ word1);
        System.out.println(" line is : "+line);


        sc.close();
    }
}