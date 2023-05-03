import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelTaskExecutor implements Runnable {

    private final BlockingQueue<Task> taskQueue;
    private final int duration;

    public ParallelTaskExecutor(BlockingQueue<Task> taskQueue, int duration) {
        this.taskQueue = taskQueue;
        this.duration = duration;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Task task = taskQueue.take();
                Thread.sleep(duration);
                task.execute();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        List<Task> tasks = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("tasks.csv"));
        String line;
        boolean firstLine = true;
        while ((line = reader.readLine()) != null) {
            if (firstLine) {
                firstLine = false;
                continue; // skip the header line
            }
            String[] fields = line.split(",");
            Task task = new Task(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2]));
            tasks.add(task);
        }
        reader.close();

        int numTasks = tasks.size();
        int numCores = Runtime.getRuntime().availableProcessors();

        BlockingQueue<Task> taskQueue = new LinkedBlockingQueue<>(numTasks);
        taskQueue.addAll(tasks);

        long startTime = System.currentTimeMillis();

        // Only one ParallelTaskExecutor instance
        executeTasks(taskQueue, 1);

        // A ParallelTaskExecutor instance per cpu core
        executeTasks(taskQueue, numCores);

        // A ParallelTaskExecutor instance per task
        executeTasks(taskQueue, numTasks);

        long endTime = System.currentTimeMillis();

        System.out.println("Total time taken: " + (endTime - startTime) + " ms");
    }

    private static void executeTasks(BlockingQueue<Task> taskQueue, int numThreads) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        for (int i = 0; i < numThreads; i++) {
            ParallelTaskExecutor executor = new ParallelTaskExecutor(taskQueue, 100);
            executorService.execute(executor);
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}

class Task {
    private final String name;
    private final int priority;
    private final int duration;

    public Task(String name, int priority, int duration) {
        this.name = name;
        this.priority = priority;
        this.duration = duration;
    }

    public void execute() {
        System.out.println("\nExecuting task " + name + " with priority " + priority + " for " + duration + " ms");
    }
}
