package oops.constructor;

public class parametrisedC {
    int roll;
    String name;
    parametrisedC(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    public static void main(String[] args) {
        parametrisedC pc=new parametrisedC(5858, ""+ "bikesh");
        parametrisedC pc1=new parametrisedC(5859,""+ "yash");
        System.out.println(pc.name);
        System.out.println(pc.roll);
        System.out.println(pc1.name);
        System.out.println(pc1.roll);
    }
    
}
