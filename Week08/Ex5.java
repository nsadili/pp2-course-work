import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The number of people in the queue: ");
        int numPeople = scanner.nextInt();

        System.out.print("The number of pieces of bread each person wants: ");
        int numBreadPerPerson = scanner.nextInt();

        System.out.print("The total amount of bread in the store: ");
        int numBreadInStore = scanner.nextInt();

        int numPeopleServed = Math.min(numPeople, numBreadInStore / numBreadPerPerson);

        System.out.println("Number of people who can buy bread: " + numPeopleServed);
    }
    public void run() {
    }
    
    public class Main {
        public static void main(String[] args) {
            Ex5 demo = new Ex5();
            demo.run();
        }
    }
    
}
