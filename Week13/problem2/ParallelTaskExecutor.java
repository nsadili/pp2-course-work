public class ParallelTaskExecutor extends Thread {
    private Queue<Task> taskQueue;

    public ParallelTaskExecutor(Queue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    public void run() {
        while (true) {
            Task task = null;
            synchronized (taskQueue) {
                if (!taskQueue.isEmpty()) {
                    task = taskQueue.poll();
                }
            }
            if (task != null) {
                try {
                    System.out.println("Executing task " + task.getName() + " for " + task.getDuration() + "ms");
                    Thread.sleep(task.getDuration());
                } catch (InterruptedException e) {
                    break;
                }
            } else {
                break;
            }
        }
    }
}
