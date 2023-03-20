import java.util.LinkedList;
import java.util.Queue;

public class Pw2 {
    public static void main(String[] args) {
        
        Queue<Integer> que = new LinkedList<>();
        int pieces[] = {2, 1, 3, 2, 1}; // number of bread pieces each person wants
        int breadIntStore = 8; // amount of bread available in the store
        int totalPeople = pieces.length;
        int peopleServed = 0;

        // Add people to the queue
        for(int piece : pieces) {

            que.add(piece);
        }
        // Serve people in the queue until we ran out of bound or there's nobody left in the queue
        while(!que.isEmpty() && breadIntStore > 0) {
            int pieceRequested = que.poll(); // remove the first person from the queue and get the number of pieces they want
           if( pieceRequested <= breadIntStore) {
            breadIntStore -= pieceRequested; 
            peopleServed++;
           }
        }

        System.out.println("Out of " + totalPeople + "people, " + peopleServed + "were able to buy bread.");
    }
}
