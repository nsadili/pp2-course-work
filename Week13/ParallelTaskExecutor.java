package ex13.ParallelTask;

import java.util.concurrent.BlockingQueue;

public class ParallelTaskExecutor implements Runnable {
    private BlockingQueue<Task> taskQueue;

    public ParallelTaskExecutor(BlockingQueue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Task task = taskQueue.take();
                Thread.sleep(task.getDuration()); // simulate task execution
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
