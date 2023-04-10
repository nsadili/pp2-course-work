package Week08;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of people in line: ");
        int numPeople = scn.nextInt();

        System.out.print("Enter the number of bread for each person: ");
        int breadPerPerson = scn.nextInt();

        System.out.print("Enter the total amount of bread: ");
        int totalBread = scn.nextInt();

        int numPeopleCanBuy = Math.min(totalBread / breadPerPerson, numPeople);

        System.out.println("Number of people who can buy bread: " + numPeopleCanBuy);

        scn.close();
    }
}