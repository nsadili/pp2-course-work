package pw08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of bread per person: ");
        var perPerson = sc.nextInt();  

        System.out.println("Enter the amount of bread in the store: ");
        var inStore = sc.nextInt();  


        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter the number of people in the queue: ");
        int numPeople = sc.nextInt();
        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter the number of pieces of bread the " + (i+1) + " person wants: ");
            int piecesWanted = sc.nextInt();
            queue.add(piecesWanted);
        }

        int numPeopleCanBuy = 0;
        while (!queue.isEmpty() && inStore > 0) {
            int piecesWanted = queue.poll();
            if (piecesWanted <= inStore) {
                numPeopleCanBuy++;
                inStore -= piecesWanted;
            }
        }

        System.out.println(numPeopleCanBuy + " people can buy bread from the store.");


        sc.close();
    }
}
