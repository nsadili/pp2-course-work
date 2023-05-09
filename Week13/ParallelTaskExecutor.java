import java.util.Queue;

public class ParallelTaskExecutor implements Runnable {
    private final Queue<Task> taskQueue;

    public ParallelTaskExecutor(Queue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while (true) {
            Task task;
            synchronized (taskQueue) {
                if (taskQueue.isEmpty()) {
                    break;
                }
                task = taskQueue.poll();
            }
            long duration = task.getDuration();
            try {
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
