package EX;
public class TimeDiffDemo {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        
        System.out.println(end - start);

        long s = System.nanoTime();
        long e = System.nanoTime();

        System.out.println(e - s);
        
    }
}