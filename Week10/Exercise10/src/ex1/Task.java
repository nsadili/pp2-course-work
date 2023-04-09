package ex1;
public class Task implements Comparable<Task> {
    private String task;

    public Task(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "Task [task=" + task + "]";
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public int compareTo(Task task2) {
        return task.compareTo(task2.task);
    }
}
