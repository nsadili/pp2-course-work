package problem2;

import java.util.Queue;

public class ParallelTaskExecutor extends Thread {

    private Queue<Task> tasks;

    public ParallelTaskExecutor(String name, Queue<Task> tasks) {
        super(name);
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (!tasks.isEmpty()) {
            Task currentTask = null;
            synchronized (tasks) {
                currentTask = tasks.poll();
            }
             synchronized (currentTask) {
                System.out.println(this.getName() + " started to execute " + currentTask.getName() + " with "
                        + currentTask.getPriority() + " priority.");
                try {
                    Thread.sleep(currentTask.getDuration());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + " finished executing " + currentTask.getName() + " in "
                        + currentTask.getDuration() + " millis.\n");
             }
        }
    }
}
