//package dsa.ARRAY;

public class Arraybasic2 {
    public static void main(String[] args)
    {
        int anArray[];
        anArray = new int[5];
        anArray[0]=1;
        anArray[1]=2;
        anArray[2]=3;
        anArray[3]=4;
        anArray[4]=5;
        System.out.println("element of oth index : "+anArray[0]);
        System.out.println("element of 1th index : "+anArray[1]);
        System.out.println("element of 2th index : "+anArray[2]);
        System.out.println("element of 3th index : "+anArray[3]);
        System.out.println("element of 4th index : "+anArray[4]);
       // System.out.println("element of oth index : "+anArray[5]);
       System.out.println("Printed by for loop ");
       for(int i =0; i<5;i++)
       {
        System.out.println("element of" +i + "th index : " +anArray[i]);
       }


    }
    
}
