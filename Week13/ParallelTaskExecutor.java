import java.util.concurrent.BlockingQueue;

public class ParallelTaskExecutor extends Thread {
    private BlockingQueue<Task> taskQueue;

    public ParallelTaskExecutor(BlockingQueue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Task task = taskQueue.take();
                executeTask(task);
            }
        } catch (InterruptedException e) {
            
        }
    }

    private void executeTask(Task task) {
        System.out.println("Executing task: " + task.getName());
        try {
            Thread.sleep(task.getDuration());
        } catch (InterruptedException e) {
            
        }
        System.out.println("Completed task: " + task.getName());
    }
}