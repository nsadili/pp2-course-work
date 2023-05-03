package ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Task> tasks = fileToQueue("./Exercise13/src/data/tasks.csv");
        ParallelTaskExecutor[] executor = new ParallelTaskExecutor[Runtime.getRuntime().availableProcessors()];

        long start = System.currentTimeMillis();

        for (int i = 0; i < executor.length; i++) {
            executor[i] = new ParallelTaskExecutor("Task" + (i + 1), tasks);
            executor[i].start();
        }

        for (ParallelTaskExecutor x: executor) {
            try {
                x.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

    public static Queue<Task> fileToQueue(String input) {
        Queue<Task> tasks = new LinkedList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(input));
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) 
                tasks.add(Task.parseTo(line));

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tasks;
    }
}
