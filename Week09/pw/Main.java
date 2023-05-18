import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Task implements Comparable<Task> {
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

    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority);
    }
}

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        try {
            File file = new File("tasks.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int priority = Integer.parseInt(parts[1].trim());
                int duration = Integer.parseInt(parts[2].trim());
                Task task = new Task(name, priority, duration);
                taskQueue.add(task);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int availableTime = 60;
        int totalTimeSpent = 0;
        List<Task> completedTasks = new ArrayList<>();

        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            if (task.getDuration() <= availableTime) {
                availableTime -= task.getDuration();
                totalTimeSpent += task.getDuration();
                completedTasks.add(task);
            } else {
                break;
            }
        }

        System.out.println("Completed tasks:");
        for (Task task : completedTasks) {
            System.out.println(task.getName());
        }

        System.out.println("Total time spent on tasks: " + totalTimeSpent + " minutes");
        System.out.println("Available time: " + availableTime + " minutes");
    }
}
