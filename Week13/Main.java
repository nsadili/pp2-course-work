package Week13;

public class Main {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println(coreCount);

        int cnt = 0;

        long starts = System.currentTimeMillis();
        for(int i = 0; i < coreCount; i++){
            for(int j = 0; j < 25000000; j++){
                
                cnt++;
            }
        }

        long finishes = System.currentTimeMillis();
        System.out.println(finishes - starts);

        Threads t0 = new MyThread();
        Threads t1 = new MyThread();
        Threads t2 = new MyThread();
        Threads t3 = new MyThread();
    }
}
