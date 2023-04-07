public class Task {
    private String name;
    private int priority;
    private int duration;

    public Task(String name, int priority, int duration) {
        this.name = name;
        this.priority = priority;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getDuration() {
        return duration;
    }
}
