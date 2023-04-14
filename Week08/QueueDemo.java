import java.util.LinkedList;
import java.util.Queue;

public class BreadQueue {
    
    public static int getNumberOfBuyers(int[] piecesPerPerson, int availablePieces) {
        Queue<Integer> queue = new LinkedList<>();

        // Add each person's requested number of bread to the queue
        for (int pieces : piecesPerPerson) {
            queue.add(pieces);
        }

        int buyers = 0;

        // Serve each person in the queue until there is no bread left or no more people in the queue
        while (!queue.isEmpty() && availablePieces > 0) {
            int pieces = queue.peek();
            if (pieces <= availablePieces) {
                queue.remove();
                availablePieces -= pieces;
                buyers++;
            } else {
                break;
            }
        }

        return buyers;
    }

    public static void main(String[] args) {
        int[] piecesPerPerson = {2, 3, 1, 4, 2};
        int availablePieces = 7;
        int buyers = getNumberOfBuyers(piecesPerPerson, availablePieces);
        System.out.println(buyers + " people can buy bread.");
    }
}

