package Week13;

public class Example3 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int CORE_COUNT = Runtime.getRuntime().availableProcessors();
        int THREAD_COUNT = CORE_COUNT/2;

        Parallel[] threads = new Parallel[CORE_COUNT / 2];

        for (int i = 0; i < THREAD_COUNT; i++){
            Parallel th = new Parallel(i, "thread name" + i);
            threads[i] = th;

        }

        for (int i = 0; i < THREAD_COUNT; i++){
            threads[i].start();

        }

        for (int i = 0; i < THREAD_COUNT; i++){
            try {
                threads[i].join();
            }
            catch (InterruptedException ex) {
                System.out.println("Interrupted: "+ex);
            }
            long sum =+ threads[i].getSum();

        }

        

        long endTime = System.currentTimeMillis();
        long workingTime = (endTime - startTime);

        System.out.println(workingTime);
    }
}
