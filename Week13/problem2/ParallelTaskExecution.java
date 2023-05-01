import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ParallelTaskExecution {
    public static void main(String[] args) throws IOException, InterruptedException {
        int numThreads = 4; // change this to experiment with different numbers of threads

        // read tasks from file
        List<Task> tasks = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("tasks.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            Task task = Task.fromCsvEntry(line);
            tasks.add(task);
        }
        reader.close();

        // create task queue
        Queue<Task> taskQueue = new ConcurrentLinkedQueue<>(tasks);

        // create and start threads
        List<ParallelTaskExecutor> threads = new ArrayList<>();
        for (int i = 0; i < numThreads; i++) {
            ParallelTaskExecutor thread = new ParallelTaskExecutor(taskQueue);
            thread.start();
            threads.add(thread);
        }

        // wait for threads to finish
        long startTime = System.currentTimeMillis();
        for (ParallelTaskExecutor thread : threads) {
            thread.join();
        }
        long endTime = System.currentTimeMillis();

        // print total time taken
        System.out.println("Total time taken: " + (endTime - startTime) + "ms");
    }
}
