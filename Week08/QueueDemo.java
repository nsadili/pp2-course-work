import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pieces of bread per person: ");
        int breadPerPerson = sc.nextInt();
        System.out.print("Enter the amount of bread in the store: ");
        int instock = sc.nextInt();
        sc.close();
        
        int buyable = instock / breadPerPerson;
        System.out.println("Number of people who can buy bread: " + buyable);
    }
}
