package oops.inheritance;
class shape{
    void display(){
        System.out.println("inside display :  class parent");
    }
}
class rectangle extends shape{
    void Area(){
        System.out.println("inside Area : child class");
    }
}
class cube extends rectangle{
    void volume(){
        System.out.println("Inside volume : subchild class");
    }
}
public class mutipleInhrt {
    public static void main(String[] args) {
        cube cc=new cube();
        cc.volume();
        cc.Area();
        cc.display();
    }  
}
