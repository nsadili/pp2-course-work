

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskScheduler {
    public static void main(String[] args) {

        try {
            Queue<Task> queue = getAllTasksInQueue("data/tasks.csv");

            ParallelTaskExecutor[] executors = //
                    new ParallelTaskExecutor[Runtime.getRuntime().availableProcessors()];

            long start = System.currentTimeMillis();

            for (int i = 0; i < executors.length; i++) {
                executors[i] = new ParallelTaskExecutor("Worker " + (i + 1), queue);
                executors[i].start();
            }

            for (ParallelTaskExecutor ex : executors)
                ex.join();

            long end = System.currentTimeMillis();
            System.out.println("Total time spend on the tasks: " + (end - start) + " millis.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static Queue<Task> getAllTasksInQueue(String filename) throws IOException {
        Queue<Task> tasks = new PriorityQueue<>();

        try (BufferedReader br = new BufferedReader(new FileReader(new File(filename)))) {
            String line = br.readLine(); // first line is the header

            while ((line = br.readLine()) != null) {
                tasks.add(Task.parseToTask(line));
            }
        }

        return tasks;
    }

}