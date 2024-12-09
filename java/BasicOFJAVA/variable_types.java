package BasicOFJAVA;

public class variable_types
{
     
        static int a = 5;  //Static variable
       
        void method()
        {
            int b =4;//local variable
            System.out.println(b);
            System.out.println("i am inside method instance variable  "+b); 
        }

        public static void main(String[] args)
        {
            int bikesh=5858; // instance varible

            System.out.println("inside class but outside method(local variable) : "+ bikesh);
            System.out.println("i am inside static variable  "+a);
           // System.out.println(b);
                        variable_types obj =new variable_types();

        obj.method();
        }
}
