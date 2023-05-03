package ex2;

import java.util.Queue;

public class ParallelTaskExecutor extends Thread {
    private Queue<Task> tasks;

    public ParallelTaskExecutor(String name, Queue<Task> tasks) {
        super(name);
        this.tasks = tasks;
    }

    public void run() {
        while (!tasks.isEmpty()) {
            Task task = null;
            synchronized (tasks) {
                task = tasks.poll();
            }

            try {
                Thread.sleep(task.getDuration());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
