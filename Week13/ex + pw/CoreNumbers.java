public class CoreNumbers {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println(cores);

        Parallel t[] = new Parallel[cores];

        for(int i = 0; i < cores; i++) {
            t[i] = new Parallel(i, "Thread #" +i);
            t[i].start();
        }
        try{
            for(int i = 0; i < cores; i++) {
                t[i].join();
            }
        } catch(InterruptedException ex) {
            System.out.println("Interrupted" + ex);
        }
        long sum = 0;
        for(int i = 0; i < cores; i++) {
            sum += t[i].getSum();
        }
        long finish = System.currentTimeMillis();
        System.out.println(sum);

        System.out.println(finish - start);
    }
}
