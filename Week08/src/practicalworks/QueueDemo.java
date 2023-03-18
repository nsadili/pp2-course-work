package practicalworks;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		int[] breadPerPerson = { 2, 3, 4, 1, 1 }; 
		
		int breadInStore = 4; 

		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 0; i < breadPerPerson.length; i++) {
			queue.offer(breadPerPerson[i]); 
		}

		int numCustomersServed = 0;
		while (!queue.isEmpty() && breadInStore >= queue.peek()) {
			breadInStore -= queue.poll(); 
			numCustomersServed++;
		}

		System.out.println(numCustomersServed + " individual/individuals is/are able to buy bread :)");
	}
}
