package EX2;

import java.util.concurrent.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BlockingQueue<Task> taskQueue = new LinkedBlockingQueue<>();

        // Load tasks from CSV
        try (BufferedReader reader = new BufferedReader(new FileReader("tasks.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Task task = new Task(parts[0], Integer.parseInt(parts[1]));
                taskQueue.add(task);
            }
        }

        int numTasks = taskQueue.size();
        long startTime = System.currentTimeMillis();

        // One executor
        new ParallelTaskExecutor(taskQueue).start();

        // One executor per CPU core
        int cores = Runtime.getRuntime().availableProcessors();
        for (int i = 0; i < cores; i++) {
            new ParallelTaskExecutor(taskQueue).start();
        }

        // One executor per task
        for (int i = 0; i < numTasks; i++) {
            new ParallelTaskExecutor(taskQueue).start();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime) + " ms");
    }
}
