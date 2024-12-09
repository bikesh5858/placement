public class Explicitconversion {
    public static void main(String[] args)
    {
        double d =5858.5858;
        System.out.println("double  value "+ d);

        float f = (float) d;
        System.out.println("Float value "+ f);

        long l=(long) d;
        System.out.println("Long value "+ l);

        int i = (int) l;
        System.out.println("Integer value "+ i);
    }
    
}
