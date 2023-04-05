import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PriorityQueuer {

    public static void main(String[] args) {

        String filePath = "requirements-file.txt";

        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String[] taskDetails = scanner.nextLine().split(",");
                String taskName = taskDetails[0];
                int taskPriority = Integer.parseInt(taskDetails[1]);
                int taskDuration = Integer.parseInt(taskDetails[2]);
                Task task = new Task(taskName, taskPriority, taskDuration);
                taskQueue.add(task);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int totalTime = 40;

        List<Task> completedTasks = new ArrayList<>();
        int timeSpent = 0;

        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            if (timeSpent + task.getDuration() <= totalTime) {
                completedTasks.add(task);
                timeSpent += task.getDuration();
            } else {
                break;
            }
        }

        System.out.println("List of tasks that could be completed within " + totalTime + " time:");
        for (Task task : completedTasks) {
            System.out.println(task.getName());
        }

        System.out.println("Total time spent on the tasks: " + timeSpent);
        System.out.println("Available time: " + totalTime);
        System.out.println("Are they the same? " + (timeSpent == totalTime ? "Yes" : "No"));

    }

}

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
        return Integer.compare(other.getPriority(), this.priority);
    }
}
