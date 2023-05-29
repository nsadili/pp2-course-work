import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Task> taskQueue = new ArrayBlockingQueue<>(100);

        long startTime = System.currentTimeMillis();

        ParallelTaskExecutor executor = new ParallelTaskExecutor(taskQueue);
        executor.start();

        while (!taskQueue.isEmpty()) {
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
            }
        }

        executor.interrupt(); 

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Total time taken: " + totalTime + " milliseconds");
    }
}