package oops.inheritance;
class A{
   void method_A(){
    System.out.println("Inside A");
   }
}
class B extends A{
    void method_B(){
     System.out.println("Inside B");
    }
 }
 class C extends A {
    void method_C(){
     System.out.println("Inside C");
    }
 }
 class D extends A{
    void method_D(){
     System.out.println("Inside D");
    }
 }
public class hierarInhrt {
    public static void main(String[] args) {
        B b=new B();
        C c=new C();
        D d=new D();
        b. method_A();
        c. method_A();
        d. method_A();
    }
    
}
