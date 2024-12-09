package oops.inheritance;
public class inheritance1 {
     void parent(){
        System.out.println("inside parent");
     }  
}
class child extends inheritance{
    public static void main(String[] args){
        child cc=new child();
        cc.parent();
    }
}
