import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueues {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("a. Given a file with a list of tasks: name, priority and duration of each task.");
        String filename = "src/tasks.txt";
        int availableTime = 120;

        PriorityQueue<Task> tasks = readTasksFromFile(filename);

        int totalTime = 0;
        System.out.println("b. Read the file and fill the entries into a collection which will order the tasks so that the task with the highest priority comes first and one with the smallest comes last.");
        while (!tasks.isEmpty() && totalTime + tasks.peek().duration <= availableTime) {
            Task task = tasks.poll();
            System.out.println(task.name);
            totalTime += task.duration;
        }
        System.out.println("c. Given total available time, print the list of tasks that could be completed not within that time. [The task with the highest priority must be executed first no matter what its duration is].");
        System.out.println("d. Print the total time spent on the task vs the available time.");
        System.out.println("Total time spent on tasks: " + totalTime + " minutes");
        System.out.println("Available time: " + availableTime + " minutes");
        System.out.println("Time difference: " + (availableTime - totalTime) + " minutes");
    }

    private static PriorityQueue<Task> readTasksFromFile(String filename) throws FileNotFoundException {
        PriorityQueue<Task> tasks = new PriorityQueue<>(Comparator.reverseOrder());
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            int priority = Integer.parseInt(parts[1]);
            int duration = Integer.parseInt(parts[2]);
            Task task = new Task(name, priority, duration);
            tasks.add(task);
        }
        scanner.close();
        return tasks;
    }

    private static class Task implements Comparable<Task> {
        private String name;
        private int priority;
        private int duration;

        public Task(String name, int priority, int duration) {
            this.name = name;
            this.priority = priority;
            this.duration = duration;
        }

        @Override
        public int compareTo(Task other) {
            return Integer.compare(this.priority, other.priority);
        }
    }
}
