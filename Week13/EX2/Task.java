package EX2;

import java.util.concurrent.*;

class Task {
    String name;
    int duration;

    public Task(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
}

class ParallelTaskExecutor extends Thread {
    private BlockingQueue<Task> taskQueue;

    public ParallelTaskExecutor(BlockingQueue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        try {
            Task task;
            while ((task = taskQueue.poll()) != null) {
                System.out.println("Executing task: " + task.name);
                Thread.sleep(task.duration);
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}