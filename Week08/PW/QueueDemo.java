import java.util.Scanner;

public class BreadQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numer of people: ");
        int numPeople = scanner.nextInt();

        System.out.print("Number of bread pieces: ");
        int numPiecesPerPerson = scanner.nextInt();

        System.out.print("Amount of bread: ");
        int numPieces = scanner.nextInt();

        int maxNumPeople = numPieces / numPiecesPerPerson;

        System.out.println(numPeople + maxNumPeople);
    }
}