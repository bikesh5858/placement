import java.util.*;
public class ValidParenthese {
    public static  boolean ismatch(char open,char close){
        if(open =='('&& close==')'||
           open =='{'&& close=='}'||
           open =='['&& close==']'){
            return true;
        }
            return false;
    }
    public static boolean isvalid(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('|| 
               str.charAt(i)=='{'||
               str.charAt(i)=='['){
                st.push(str.charAt(i));
               }
            else{
                if(st.isEmpty()) return false;
                char ch=st.peek();
                st.pop();
                if(!ismatch(ch,str.charAt(i))) return false;
            }  
        }
        return st.isEmpty();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a parenthesis: ");
        String str=sc.nextLine();
        boolean res=isvalid(str);
       if(res==true){
        System.out.println("Valid ");
       }
       else{
        System.out.println("InValid ");
       }
        sc.close();
    }
    
}
