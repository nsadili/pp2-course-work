import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int breadInStore = scanner.nextInt();

        Queue<Integer> breadQueue = new LinkedList<>();

        scanner.nextLine(); 
        String[] breadRequests = scanner.nextLine().split(" ");
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

