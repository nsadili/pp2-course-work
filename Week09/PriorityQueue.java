import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TaskManager {

    public static void main(String[] args) {
        // Read the file and fill the entries into a priority queue
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.reverseOrder());
        try (Scanner scanner = new Scanner(new File("tasks.txt"))) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",");
                String name = line[0].trim();
                int priority = Integer.parseInt(line[1].trim());
                int duration = Integer.parseInt(line[2].trim());
                taskQueue.offer(new Task(name, priority, duration));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Given total available time, print the list of tasks that could be completed within that time
        int availableTime = 60; // Example available time of 1 hour
        int totalTime = 0;
        System.out.println("Tasks to be completed:");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.peek();
            if (totalTime + task.getDuration() <= availableTime) {
                task = taskQueue.poll();
                System.out.println(task.getName());
                totalTime += task.getDuration();
            } else {
                break;
            }
        }

        // Print the total time spent on the tasks vs the available time
        System.out.println("Total time spent on tasks: " + totalTime);
        System.out.println("Available time: " + availableTime);
        if (totalTime == availableTime) {
            System.out.println("The total time spent on the tasks is equal to the available time.");
        } else {
            System.out.println("The total time spent on the tasks is not equal to the available time.");
        }
    }

    static class Task implements Comparable<Task> {
        private final String name;
        private final int priority;
        private final int duration;

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
            return Integer.compare(this.priority, other.priority);
        }
    }
}
