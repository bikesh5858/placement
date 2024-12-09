package oops.constructor;

public class copycon {
    int roll;
    String name;
    copycon(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    copycon(copycon cc1){
        this.name=cc1.name;
        this.roll=cc1.roll;
    }
    public static void main(String[] args) {
        copycon cc=new copycon(5858, "bikesh");
        System.out.println(cc.name +" "+ cc.roll);
        copycon ccCopy = new copycon(cc);
        System.out.println("Copied Object: " + ccCopy.name + " " + ccCopy.roll);
    }
    
}
