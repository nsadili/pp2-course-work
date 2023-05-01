import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ParallelTaskExecution {

    private static final String TASKS_FILE = "tasks.csv";
    private static final int QUEUE_CAPACITY = 100;

    public static void main(String[] args) throws InterruptedException {
        List<Task> tasks = readTasksFromFile(TASKS_FILE);

        long startTime = System.currentTimeMillis();

        runTasksWithExecutor(1, tasks);

        int numCores = Runtime.getRuntime().availableProcessors();
        runTasksWithExecutor(numCores, tasks);

        runTasksWithExecutor(tasks.size(), tasks);

        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime) + "ms");
    }

    private static void runTasksWithExecutor(int numExecutors, List<Task> tasks) throws InterruptedException {
        BlockingQueue<Task> taskQueue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < numExecutors; i++) {
            Thread thread = new Thread(new ParallelTaskExecutor(taskQueue));
            thread.start();
            threads.add(thread);
        }
        for (Task task : tasks) {
            taskQueue.put(task);
        }
        for (int i = 0; i < numExecutors; i++) {
            taskQueue.put(new NullTask());
        }
        for (Thread thread : threads) {
            thread.join();
        }
    }

    private static List<Task> readTasksFromFile(String fileName) {
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                int duration = Integer.parseInt(fields[2]);
                tasks.add(new Task(id, name, duration));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    private static class Task {
        private final int id;
        private final String name;
        private final int duration;

        public Task(int id, String name, int duration) {
            this.id = id;
            this.name = name;
            this.duration = duration;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getDuration() {
            return duration;
        }
    }

    private static class NullTask extends Task {
        public NullTask() {
            super(-1, "", 0);
        }
    }

    private static class ParallelTaskExecutor implements Runnable {
        private final BlockingQueue<Task> taskQueue;

        public ParallelTaskExecutor(BlockingQueue<Task> taskQueue) {
            this.taskQueue = taskQueue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Task task = taskQueue.take();
                    if (task instanceof NullTask) {
                        break;
                    }
                    System.out.println("Executing task " + task.getId() + ": " + task.getName());
                    Thread.sleep(task.getDuration());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}