package Week13.ParallelTaskExecution;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecutorProblem extends Thread {
    private Queue<Task> tasks;
    public ExecutorProblem(String name, Queue<Task> tasks) {
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
                System.out.println(this.getName() + " started to execute file " + currentTask.getName() + " with "
                        + currentTask.getPriority() + " priority ");
                try {
                    Thread.sleep(currentTask.getDuration());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + " finished executing file " + currentTask.getName() + " in "
                + currentTask.getDuration() + " millis\n ");
        }
    }
}