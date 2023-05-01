public class Task implements Comparable<Task> {
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

    public String toString() {
        return name + " (" + priority + ")";
    }

    public int compareTo(Task other) {
        return priority - other.getPriority();
    }

    public static Task fromCsvEntry(String csvEntry) {
        String[] tokens = csvEntry.split(",");
        String name = tokens[0];
        int priority = Integer.parseInt(tokens[1]);
        int duration = Integer.parseInt(tokens[2]);
        return new Task(name, priority, duration);
    }
}
