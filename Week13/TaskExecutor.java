import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskExecutor {
    private static final int NUM_THREADS = 4; // Change this to change the number of threads
    private static final String FILENAME = "tasks.csv";

    public static void main(String[] args) {
        List<Task> tasks = readTasksFromFile(FILENAME);
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        List<Future<Long>> results = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for (Task task : tasks) {
            Future<Long> result = executor.submit(() -> {
                long duration = task.getDuration();
                Thread.sleep(duration);
                return duration;
            });
            results.add(result);
        }

        long totalTime = 0;
        for (Future<Long> result : results) {
            try {
                totalTime += result.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Total time taken: " + elapsedTime + "ms");
    }

    private static List<Task> readTasksFromFile(String filename) {
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String description = parts[1];
                long duration = Long.parseLong(parts[2]);
                Task task = new Task(id, description, duration);
                tasks.add(task);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }
}
