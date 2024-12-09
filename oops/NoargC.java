package oops;

public class NoargC {
    int roll;
    String name;
    NoargC(){
        this.roll=5858;
        this.name="bikesh";
    }

    public static void main(String[] args) {
        NoargC nac=new NoargC();
        System.out.println(nac.roll);
        System.out.println(nac.name);
    }
    
}
