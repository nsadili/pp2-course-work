package practicalworks;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		int[] piecesPerPerson = { 2, 1, 3, 4, 2, 2 }; 
		
		int totalPiecesInStore = 15; 
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int pieces : piecesPerPerson) {
			queue.add(pieces);
		}

		int numPeopleBoughtBread = 0;
		
		while (!queue.isEmpty() && totalPiecesInStore > 0) {
			int pieces = queue.remove();
			totalPiecesInStore -= pieces;
			if (totalPiecesInStore >= 0) {
				numPeopleBoughtBread++;
			} else {
				break;
			}
		}

		System.out.println(numPeopleBoughtBread + " individual/individuals is/are able to buy bread :)");
	}
}
