public class TimeDiffDemo {
    public static void main(String[] args) {
        long a= System.currentTimeMillis();
        //aaa
        long b=System.currentTimeMillis();
        System.out.println(a-b);


        long A= System.nanoTime();
        //......
        long B=System.nanoTime();

    }
}
