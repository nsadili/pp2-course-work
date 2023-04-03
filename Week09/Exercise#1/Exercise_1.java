import java.io.File; //this import helps us with providing classes for working with other files
import java.io.FileNotFoundException; //this import helps us to show a message if the file is not found
import java.util.ArrayList; //this import helps us providing classes for dynamic arrays
import java.util.Collections; //this import helps us providing classes to work with collections 
import java.util.List; //this import helps us providing specific interface used to demonstrate an ordered collection of elements
import java.util.Scanner; //this import helps us reading the input 


//writing main class by writing the name same to the name of the file (Exercsie_1.java)
public class Exercise_1  {

    /*
    1. In public static void we throw an exception, which was recieved from the import in the second line
    2. Then we write readTasksFromFile method and passing the string "file.txt" so our code will acquire information from specifically
    provided file. 
    3. Collections.sort method was used so and the Collections.reverseOrder() will be passed as an argument. This means that the task 
    with the highest priority will appear first in the sorted list. In more simplier words, we "say" to our computer that the sorted list
    will be the most important one. 
    4. The final step is to write what will appear before the list by itself. In our case it will write: "Sorted tasks:"
    */
    public static void main(String[] args) throws FileNotFoundException {
        List<Task> tasks = readTasksFromFile("file.txt");

        Collections.sort(tasks, Collections.reverseOrder());
        System.out.println("Sorted tasks:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    /*
    1. Again we throw an exception if the file will not be found. Then we create a new
    ArrayList object that will hold the Task objects that will be read from the file.
    2. Second step will be conducted to writing a very complicated method of reading information from other file. Let me explain 
    in a simplier way not mentioning every method by writing about the whole process of writing them: 
    (1) Firstly, we create new Scanner object, which read our file (starts reading)
    (2) Then we should add a loop, so our computer will understand to what point it should read. If we say to it to read the file without
    writing anything about the loop, it will read it endlessly. 
    (3) Now, complicated steps begin. We should explain it how to read the file, and what is the reading by itself. 
    The first part of the text (before the first comma) is the name of a task. The second part (between the first and second commas)
    is a number that tells us how important the task is (we called this the "priority"). The third part (after the second comma) is
    a number that tells us how long the task will take to complete (we call this the "duration"). Using these rules, we say computer
    3. After teaching how to read we add  new Task object with specific values (name, priorit and duration) and assign it to the task variable 
    It helps us to add the task object to the tasks list. 
    4. Ultimately, we close our scanner meaning that the method is over. 
     */

    private static List<Task> readTasksFromFile(String fileName) throws FileNotFoundException {
        List<Task> tasks = new ArrayList<>();
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            int priority = Integer.parseInt(parts[1]);
            double duration = Double.parseDouble(parts[2]);
            Task task = new Task(name, priority, duration);
            tasks.add(task);
        }
        scanner.close();
        return tasks;
    }

    /*
    Ultimately, we should end our code with working with the Task by itself.  
    1. This part defines a class called Task representing its name, priority, and duration. The class has private instance 
    variables for the name, priority, and duration, as well as a constructor to initialize these variables, and getter methods
    to retrieve them.
    2. We also implement the Comparable interface, which means that it can be compared to other Task. This act is not manifested in this code,
    but may be very important in others.
    3. The final step is iverriding toString method to return the representations of task by returning name, priority and duration. 
    This method is called when the task is printed to the console using System.out.println(task).
     */

    private static class Task implements Comparable<Task> {
        private String name;
        private int priority;
        private double duration;

        public Task(String name, int priority, double duration) {
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

        public double getDuration() {
            return duration;
        }

        @Override
        public int compareTo(Task other) {
            return Integer.compare(this.priority, other.priority);
        }

        @Override
public String toString() {
    return String.format("%s (priority: %d, duration: %.1f)", getName(), getPriority(), getDuration());
}
    }
}

//Please, not that the file is provided and must be provided in the same folder: Exercise_1. If you want to change it - avoid spaces!
//It will cause an error in our code, because computer will not understand spaces. 