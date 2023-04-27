package Week13;

public class Example2 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int CORE_COUNT = Runtime.getRuntime().availableProcessors();

        Parallel[] threads = new Parallel[CORE_COUNT / 2];

        Parallel p1 = new Parallel(1 , "thread 1");
        Parallel p2 = new Parallel(2 , "thread 2");
        Parallel p3 = new Parallel(3 , "thread 3");
        
        p1.start();
        p2.start();
        p3.start();

        try {
            p1.join(); p2.join(); p3.join();
        }
        catch (InterruptedException ex) {
            System.out.println("Interrupted: "+ex);
        }
        long sum = p1.getSum() + p2.getSum() + p3.getSum();

        long endTime = System.currentTimeMillis();
        long workingTime = (endTime - startTime);

        System.out.println(workingTime);
    }
}

