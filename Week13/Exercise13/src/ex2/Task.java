package ex2;

public class Task {
    private String name;
    private int duration;
    private int priority;

    public Task(String name, int priority, int duration) {
        this.name = name;
        this.priority = priority;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public static Task parseTo(String input) {
        Task task = null;

        try {
            String values[] = input.split(",");
            task = new Task(values[0], Integer.valueOf(values[1]), Integer.valueOf(values[2]));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return task;
    }

    public void execute() {
        System.out.println("Executed " + this.name);
    }

    @Override
    public String toString() {
        return "Task [duration=" + duration + ", name=" + name + ", priority=" + priority + "]";
    }
}
