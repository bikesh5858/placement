package oops.inheritance;
public class inheritance {
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
