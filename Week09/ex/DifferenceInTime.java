package Week09.ex;

public class DifferenceInTime {
    public static void main(String[] args) {
       long start =  System.currentTimeMillis();
       long end =  System.currentTimeMillis();

       System.out.println(end - start);
       System.out.println(start);

       long s = System.nanoTime();
       System.out.println(s);
    }
}
