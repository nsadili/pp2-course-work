import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueDemo {
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

        if(numBread<numPeople){
            System.out.println("Sorry, we cannot provide bread to everyone.");
            System.out.println("The maximum number of people we can sell (1 bread each): "+numBread);
            System.exit(0);
        }

        if (numBread<numPeople*brPerPerson){
            System.out.println("Sorry, we cannot provide the required number of bread to everyone.");
            int updtdBrPerPerson=numBread/numPeople;
            // System.out.println(updtdBrPerPerson);
            System.out.println("The maximum number of people we can sell: "+numBread/updtdBrPerPerson);
            System.out.println("The remaining bread number: "+numBread%updtdBrPerPerson);
            System.exit(0);
        }


        for (int i=0; i<numBread; i++){
                for (int j=0; j<brPerPerson; j++){
                    queue.poll(); 
                }
            }

        System.out.println("The waiting people number in queue: "+queue.size());
        System.out.println("The number of people could buy bread: "+(numPeople-queue.size()));

    }
}
