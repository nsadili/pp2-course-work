import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people in the queue: ");
        int numPeople = scanner.nextInt();

        System.out.print("Enter the number of pieces of bread each person wants: ");
        int numBreadPerPerson = scanner.nextInt();

        System.out.print("Enter the total amount of bread in the store: ");
        int numBreadInStore = scanner.nextInt();

        PriorityQueue<Person> queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.numBread));

        for (int i = 0; i < numPeople; i++) {
            queue.offer(new Person(numBreadPerPerson));
        }

        int numPeopleServed = 0;

        while (!queue.isEmpty() && numBreadInStore >= queue.peek().numBread) {
            Person person = queue.poll();
            numBreadInStore -= person.numBread;
            numPeopleServed++;
        }

        System.out.println("Number of people who can buy bread: " + numPeopleServed);
    }

    static class Person {
        int numBread;

        public Person(int numBread) {
            this.numBread = numBread;
        }
    }

    public void run() {
    }
    
    public class Main {
        public static void main(String[] args) {
            Ex6 demo = new Ex6();
            demo.run();
        }
    }
}
