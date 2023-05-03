class Parallel extends Thread {
    private long from, to, cnt;

    public Parallel(long from, long to) {
        this.from = from;
        this.to = to;
    }

    public long getCount() {
        return cnt;
    }

    public void run() {
        cnt = 0;
        for (long i = from; i < to; i++)
            if (i % 2000000 == 0) cnt += i;
    }
}

public class classpw {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();

        int cores = Runtime.getRuntime().availableProcessors();
        Parallel[] threads = new Parallel[cores];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Parallel(i * 8_000_000_000L / cores, (i + 1) * 8_000_000_000L / cores);
            threads[i].start();
        }

        long sum = 0;
        try {
            for (int i = 0; i < threads.length; i++) {
                sum += threads[i].getCount();
                threads[i].join();
            }
        } catch (Exception e) {
            System.out.println("Interrupted" + e);
        }

        long after = System.currentTimeMillis();
        long workingTime = (after - before);
        System.out.println(workingTime);
        System.out.println(sum);
    }
}
