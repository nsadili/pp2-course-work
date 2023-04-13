import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TaskManager {

    public static void main(String[] args) throws FileNotFoundException {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        File file = new File("tasks.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split(",");
            Task task = new Task(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            taskQueue.add(task);
        }
        scanner.close();

        // Print the tasks in order of priority
        System.out.println(taskQueue);

        int availableTime = 10; // Example value

        int totalTime = 0;
        System.out.println("Tasks to be completed within " + availableTime + " minutes:");
        while (!taskQueue.isEmpty() && totalTime + taskQueue.peek().getDuration() <= availableTime) {
            Task task = taskQueue.poll();
            System.out.println(task);
            totalTime += task.getDuration();
        }

        System.out.println("Total time spent on tasks: " + totalTime + " minutes");
        System.out.println("Available time: " + availableTime + " minutes");
    }

    static class Task implements Comparable<Task> {
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
        public int compareTo(Task o) {
            return Integer.compare(o.priority, this.priority);
        }

        @Override
        public String toString() {
            return name + " (Priority: " + priority + ", Duration: " + duration + ")";
        }
        
    }
}
