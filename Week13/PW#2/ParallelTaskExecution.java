import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task {
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

class ParallelTaskExecutor implements Runnable {
    private final Queue<Task> tasks;

    public ParallelTaskExecutor(Queue<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        Task task;
        while ((task = getTask()) != null) {
            try {
                System.out.println("Executing: " + task.getName());
                Thread.sleep(task.getDuration());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized Task getTask() {
        return tasks.isEmpty() ? null : tasks.poll();
    }
}

public class ParallelTaskExecution {
    public static void main(String[] args) {
        Queue<Task> tasks = readTasksFromCsv("tasks.csv");

        long startTime = System.currentTimeMillis();

         executeTasks(tasks, 1);

         int cores = Runtime.getRuntime().availableProcessors();
        executeTasks(tasks, cores);

         executeTasks(tasks, tasks.size());

     }

    private static Queue<Task> readTasksFromCsv(String fileName) {
        Queue<Task> tasks = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                tasks.add(new Task(parts[0], Integer.parseInt(parts[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    private static void executeTasks(Queue<Task> tasks, int numWorkers) {
        ExecutorService executor = Executors.newFixedThreadPool(numWorkers);
        for (int i = 0; i < numWorkers; i++) {
            executor.submit(new ParallelTaskExecutor(new LinkedList<>(tasks)));
        }
        executor.shutdown();
        try {
            if (!executor.awaitTermination(1, TimeUnit.HOURS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Execution with " + numWorkers + " workers took " + (endTime - startTime) + " milliseconds");
    }
}
