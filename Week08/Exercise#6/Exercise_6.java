import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of people in the queue: ");
        int People = scanner.nextInt();

        System.out.print("Number of bread per person: ");
        int BreadForPerson = scanner.nextInt();

        System.out.print("Amount of required bread: ");
        int RequiredBread = scanner.nextInt();

        // Calculate the maximum number of people who can buy the required amount of bread
        int People2 = RequiredBread / BreadForPerson;
        if (People2 > People) {
            People2 = People;
        }

        System.out.println("Out of " + People + " people in the queue, "
                + People2 + " people will be able to buy " + RequiredBread + " pieces of bread.");
    }

}