import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void readTasksFromFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int priority = Integer.parseInt(parts[1]);
                int duration = Integer.parseInt(parts[2]);
                tasks.add(new Task(name, priority, duration));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        Collections.sort(tasks, (t1, t2) -> t2.getPriority() - t1.getPriority());
    }

    public List<Task> getTasksWithinTime(int totalTime) {
        List<Task> tasksWithinTime = new ArrayList<>();
        int timeLeft = totalTime;
        for (Task task : tasks) {
            if (task.getDuration() <= timeLeft) {
                tasksWithinTime.add(task);
                timeLeft -= task.getDuration();
            }
        }
        return tasksWithinTime;
    }

    public void printTimeSpentVsAvailableTime(int totalTime) {
        int timeSpent = 0;
        for (Task task : tasks) {
            timeSpent += task.getDuration();
        }
        System.out.println("Total time spent on tasks: " + timeSpent);
        System.out.println("Available time: " + totalTime);
        if (timeSpent == totalTime) {
            System.out.println("Time spent and available time are the same.");
        } else if (timeSpent < totalTime) {
            System.out.println("Time spent is less than available time.");
        } else {
            System.out.println("Time spent is greater than available time.");
        }
    }
}
