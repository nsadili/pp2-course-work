import java.util.PriorityQueue;

public class BreadPriorityQueue {
    
    public static int getMaximumBuyers(int[] piecesPerPerson, int availablePieces) {
        // Create a priority queue and add each person's requested number of bread to it
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int pieces : piecesPerPerson) {
            queue.offer(pieces);
        }

        int buyers = 0;

        // Serve each person in the priority queue until there is no bread left or no more people in the queue
        while (!queue.isEmpty() && availablePieces >= queue.peek()) {
            int pieces = queue.poll();
            availablePieces -= pieces;
            buyers++;
        }

        return buyers;
    }

    public static void main(String[] args) {
        int[] piecesPerPerson = {2, 3, 1, 4, 2};
        int availablePieces = 7;
        int buyers = getMaximumBuyers(piecesPerPerson, availablePieces);
        System.out.println(buyers + " people can buy bread.");
    }
}

