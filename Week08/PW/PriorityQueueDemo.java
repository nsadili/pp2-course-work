import java.util.Scanner;

public class BreadQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of people: ");
        int numPeople = scanner.nextInt();

        System.out.print("Number of bread pieces: ");
        int numPiecesPerPerson = scanner.nextInt();

        System.out.print("Amount of bread which is required: ");
        int requiredAmount = scanner.nextInt();

        int maxNumPeople = Math.min(numPeople, requiredAmount / numPiecesPerPerson);

        System.out.println(num_People + maxNumPeople);
    }
}