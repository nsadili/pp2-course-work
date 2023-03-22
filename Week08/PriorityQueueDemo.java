import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int breadInStore = scanner.nextInt();

        scanner.nextLine(); 
        String[] breadRequests = scanner.nextLine().split(" ");
        PriorityQueue<Integer> breadQueue = new PriorityQueue<>((a, b) -> b - a);
        for(String request : breadRequests){
            breadQueue.add(Integer.parseInt(request));
        }

        int numCustomers = 0;
        while(!breadQueue.isEmpty() && breadInStore >= breadQueue.peek()){
            int numBreadWanted = breadQueue.poll();
            breadInStore -= numBreadWanted;
            numCustomers++;
        }

        System.out.println(numCustomers);
    }
}

