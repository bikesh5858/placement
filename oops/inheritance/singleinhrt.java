package oops.inheritance;
class shape{
    public void display(){
        System.out.println("inside display (parent class )");
    }
}
class rectangle extends shape{
    public void Area(){
        System.out.println("inside area (child class)");
    }
}
public class singleinhrt {
    public static void main(String[] args) {
        rectangle rr=new rectangle();
        rr.Area();
        rr.display();
    }  
}
