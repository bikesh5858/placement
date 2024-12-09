import java.util.Scanner;

public class inputout{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a line :");
        String line= sc.nextLine();

        System.out.println("Enter a word " );
        String word=sc.next();
        
        System.out.println(word);
        System.out.println(line);

        sc.close();
    }
}