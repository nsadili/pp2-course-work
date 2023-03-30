public class TimeDifference {
    public static void main(String[] args) {
       long start =  System.currentTimeMillis();

       long end =  System.currentTimeMillis();

       System.out.println(end - start);


       long s = System.nanoTime();

       long e = System.nanoTime();

    }
}