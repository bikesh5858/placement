import java.util.*;
public class IoString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

           System.out.println("enter a line ");
        String line = sc.nextLine();
        System.out.println(line);

        System.out.println("Enter a name ");
        String s=sc.next();
        System.out.println(s);
     
        String s1=new String("bikesh");
        String s2="bikesh";
        String s3="bikesh";

        System.out.println(s1==s3);
        System.out.println(s1==s2);

        String s4="kumar";

        String s6=10+20+s2+s4+40+40; //IMPORTANT//

        System.out.println(s6);
       
        System.out.println(s2+ " "+s4);
        System.out.println(s1+ " "+s4);
        String s5=s1+" "+s4;
        System.out.println(s5);
        System.out.println(s1==s3);
        System.out.println(s5==s6);

        sc.close();
    }
}
