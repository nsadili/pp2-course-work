package Week13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelTaskExecution {
    private static final int NUM_THREADS = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) throws IOException, InterruptedException {
        String fileName = "tasks.csv";
        List<Task> tasks = readTasksFromFile(fileName);

        // Single ParallelTaskExecutor instance
        runTasks(tasks, 1);

        // ParallelTaskExecutor instance per CPU core
        runTasks(tasks, NUM_THREADS);

        // ParallelTaskExecutor instance per task
        runTasks(tasks, tasks.size());
    }

    private static List<Task> readTasksFromFile(String fileName) throws IOException {
        List<Task> tasks = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                Task task = new Task(parts[0], Integer.parseInt(parts[1]));
                tasks.add(task);
            }
        }

        return tasks;
    }

    private static void runTasks(List<Task> tasks, int numThreads) throws InterruptedException {
        System.out.println("Running tasks with " + numThreads + " threads.");

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        BlockingQueue<Task> taskQueue = new LinkedBlockingQueue<>(tasks);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numThreads; i++) {
            executor.execute(new ParallelTaskExecutor(taskQueue));
        }

        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken: " + (endTime - startTime) + " ms.");
    }

    private static class Task {
        private final String name;
        private final int duration;

        public Task(String name, int duration) {
            this.name = name;
            this.duration = duration;
        }

        public String getName() {
            return name;
        }

        public int getDuration() {
            return duration;
        }
    }

    private static class ParallelTaskExecutor implements Runnable {
        private final BlockingQueue<Task> taskQueue;

        public ParallelTaskExecutor(BlockingQueue<Task> taskQueue) {
            this.taskQueue = taskQueue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    Task task = taskQueue.poll();
                    if (task == null) {
                        break;
                    }
                    System.out.println("Executing task: " + task.getName());
                    Thread.sleep(task.getDuration());
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}