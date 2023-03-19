import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of people in the queue: ");
        int numPeople = input.nextInt();
        
        System.out.print("Enter the number of pieces of bread each person wants: ");
        int numBreadPerPerson = input.nextInt();
        
        System.out.print("Enter the amount of bread in the store: ");
        int numBreadInStore = input.nextInt();
        
        int numPeopleCanBuy = numBreadInStore / numBreadPerPerson;
        
        if (numPeopleCanBuy > numPeople) {
            System.out.println(numPeople + " people can buy bread.");
        } else {
            System.out.println(numPeopleCanBuy + " people can buy bread.");
        }
    }
}
