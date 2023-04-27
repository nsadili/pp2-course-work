package ex13.ParallelTask;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    private static final String TASKS_FILE = "tasks.csv";
    private static final int QUEUE_CAPACITY = 1000;
    private static final int NUM_TASKS = 1000;

    public static void main(String[] args) throws IOException, InterruptedException {
        List<Task> tasks = Task.readTasksFromFile(TASKS_FILE);

        // create the shared task queue
        BlockingQueue<Task> taskQueue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);

        // add tasks to the queue
        for (int i = 0; i < NUM_TASKS; i++) {
            Task task = tasks.get(i % tasks.size()); // use tasks in a circular manner
            taskQueue.put(task);
        }

        // execute tasks using a single worker thread
        executeTasks(taskQueue, 1);

        // execute tasks using one worker thread per cpu core
        executeTasks(taskQueue, Runtime.getRuntime().availableProcessors());

        // execute tasks using one worker thread per task
        executeTasks(taskQueue, NUM_TASKS);
    }

    private static void executeTasks(BlockingQueue<Task> taskQueue, int numWorkers) throws InterruptedException {
        System.out.println("Executing tasks with " + numWorkers + " workers...");
        long start = System.currentTimeMillis();

        // create worker threads
        Thread[] workers = new Thread[numWorkers];
        for (int i = 0; i < numWorkers; i++) {
            workers[i] = new Thread(new ParallelTaskExecutor(taskQueue));
            workers[i].start();
        }

        // wait for worker threads to complete
        for (int i = 0; i < numWorkers; i++) {
            workers[i].join();
        }

        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start) + " ms\n");
    }
}
