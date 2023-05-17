package Week13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelTaskExecution {
    private static final String FILENAME = "tasks.csv";

    public static void main(String[] args) {
        List<Task> tasks = readTasksFromFile(FILENAME);

        // Single ParallelTaskExecutor instance
        long startTime = System.currentTimeMillis();
        int numWorkers = 1;
        executeTasks(tasks, numWorkers);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Single ParallelTaskExecutor Instance - Total Time: " + totalTime + "ms");
        System.out.println();

        // ParallelTaskExecutor instance per CPU core
        startTime = System.currentTimeMillis();
        numWorkers = Runtime.getRuntime().availableProcessors();
        executeTasks(tasks, numWorkers);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("ParallelTaskExecutor Instances per CPU Core - Total Time: " + totalTime + "ms");
        System.out.println();

        // ParallelTaskExecutor instance per task
        startTime = System.currentTimeMillis();
        numWorkers = tasks.size();
        executeTasks(tasks, numWorkers);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("ParallelTaskExecutor Instances per Task - Total Time: " + totalTime + "ms");
    }

    public static void executeTasks(List<Task> tasks, int numWorkers) {
        ExecutorService executorService = Executors.newFixedThreadPool(numWorkers);

        for (Task task : tasks) {
            executorService.submit(new ParallelTaskExecutor(task));
        }

        executorService.shutdown();
    }

    public static List<Task> readTasksFromFile(String filename) {
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 2) {
                    String name = data[0];
                    int duration = Integer.parseInt(data[1]);
                    tasks.add(new Task(name, duration));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    static class ParallelTaskExecutor implements Runnable {
        private Task task;

        public ParallelTaskExecutor(Task task) {
            this.task = task;
        }

        @Override
        public void run() {
            System.out.println("Executing Task: " + task.getName());
            try {
                Thread.sleep(task.getDuration());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Completed Task: " + task.getName());
        }
    }
}

class Task {
    private String name;
    private int duration;

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
