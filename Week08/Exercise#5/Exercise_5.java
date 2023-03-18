import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of people in the queue: ");
        int People = scanner.nextInt();

        System.out.print("Number of bread per person: ");
        int BreadForPerson = scanner.nextInt();

        System.out.print("Amount of bread: ");
        int BreadAmount = scanner.nextInt();

        int People2 = BreadAmount / BreadForPerson;

        System.out.println("Among " + People + "people, "
                + People2 + "will be able to buy bread.");
    }

}