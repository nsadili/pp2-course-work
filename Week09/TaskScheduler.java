package Week09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TaskScheduler {
    
    private static class Task {
        String name;
        int priority;
        int duration;
        
        Task(String name, int priority, int duration) {
            this.name = name;
            this.priority = priority;
            this.duration = duration;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Task> queue = new PriorityQueue<>(Comparator.comparingInt(t -> -t.priority)); 
        int totalTime = 0;
        int availableTime = 60; 
        
        try {
            File file = new File("time.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int priority = Integer.parseInt(parts[1]);
                int duration = Integer.parseInt(parts[2]);
                Task task = new Task(name, priority, duration);
                queue.add(task);
                totalTime += duration;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        System.out.println("Tasks that could not be completed in " + availableTime + " minutes:");
        while (!queue.isEmpty() && availableTime >= queue.peek().duration) {
            Task task = queue.poll();
            System.out.println(task.name);
            availableTime -= task.duration;
        }
        
        System.out.println("Total time spent on tasks: " + totalTime + " minutes");
        System.out.println("Available time: " + availableTime + " minutes");
        System.out.println("Time difference: " + Math.abs(totalTime - availableTime) + " minutes");
    }
}
