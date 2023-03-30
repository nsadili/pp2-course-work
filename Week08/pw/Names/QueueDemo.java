import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        int numPeople, brPerPerson, numBread;
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide the number of people: ");
        numPeople=sc.nextInt();
        for (int i=0; i<numPeople; i++){
            queue.offer("Person "+ (i+1));
        }
        System.out.println(queue);

        System.out.println("Please provide the number of bread: ");
        numBread=sc.nextInt();

        System.out.println("Please provide the number of bread per people: ");
        brPerPerson=sc.nextInt();

        sc.close();

        int numBread2=numBread;
        for (int i=0; i<numBread; i++){
            if((numBread2-brPerPerson)<0) {
                System.out.println("Bread at the bakery ran out!\n");
                break;
            }
            else {
                for (int j=0; j<brPerPerson; j++){
                    queue.poll();
                    numBread2--;
                    
                }
            }
        }
        // System.out.println(queue);

        System.out.println("The remaining bread number: "+numBread2);
        System.out.println("The waiting people number in queue: "+queue.size());
        System.out.println("The number of people could buy bread: "+(numPeople-queue.size()));

    }
}
