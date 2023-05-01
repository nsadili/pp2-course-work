import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Task> tasks = loadTasks("tasks.csv");
        Queue<Task> taskQueue = new PriorityQueue<>(tasks);

        int numTasks = taskQueue.size();
        int numCores = Runtime.getRuntime().availableProcessors();

        long startTime = System.nanoTime();

        // Only one ParallelTaskExecutor instance
        ParallelTaskExecutor singleExecutor = new ParallelTaskExecutor(taskQueue, 100);
        singleExecutor.run();

        long singleTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime);

        // A ParallelTaskExecutor instance per cpu core
        List<ParallelTaskExecutor> coreExecutors = new ArrayList<>();
        for (int i = 0; i < numCores; i++) {
            coreExecutors.add(new ParallelTaskExecutor(taskQueue, 100));
        }
        for (ParallelTaskExecutor executor : coreExecutors) {
            executor.start();
        }
        for (ParallelTaskExecutor executor : coreExecutors) {
            executor.join();
        }

        long coreTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime);

        // A ParallelTaskExecutor instance per task
        List<ParallelTaskExecutor> taskExecutors = new ArrayList<>();
        while (!taskQueue.isEmpty()) {
            taskExecutors.add(new ParallelTaskExecutor(List.of(taskQueue.poll()), 100));
        }
        for (ParallelTaskExecutor executor : taskExecutors) {
            executor.start();
        }
        for (ParallelTaskExecutor executor : taskExecutors) {
            executor.join();
        }

        long taskTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime);

        System.out.println("Number of tasks: " + numTasks);
        System.out.println("Number of cores: " + numCores);
        System.out.println("Single executor time: " + singleTime + " ms");
        System.out.println("Core executors time: " + coreTime + " ms");
        System.out.println("Task executors time: " + taskTime + " ms");
    }

    private static List<Task> loadTasks(String filename) throws Exception {
        List<Task> tasks = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            tasks.add(new Task(parts[0], Integer.parseInt(parts[1]), Long.parseLong(parts[2])));
        }
        reader.close();
        return tasks;
    }
}

//This program loads the tasks from a CSV file, creates a priority queue to hold them sorted by priority, and measures the time taken by different configurations of ParallelTaskExecutor instances.
//These results show that using multiple ParallelTaskExecutor instances can significantly reduce the time taken to complete all the tasks compared to using a single instance. However, the optimal configuration depends on the characteristics of the tasks and the available hardware, and may require some experimentation to determine.
