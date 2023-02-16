// not ready still...

package practicalworks;

import java.util.Random;

public class CrapsGame {
	public static void main(String[] args) {
		playRound();
		playMultipleRounds(10);
	}

	public static void playRound() {
		Random random = new Random();
		int roll1 = random.nextInt(6) + 1; 
		int roll2 = random.nextInt(6) + 1; 
		int sum = roll1 + roll2;
		System.out.println("Roll: " + roll1 + " + " + roll2 + " = " + sum);

		if (sum == 7 || sum == 11) {
			System.out.println("You win!");
		} else if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("You lose!");
		} else {
			int point = sum;
			System.out.println("Point established: " + point);
		}
	}

	public static void playMultipleRounds(int numRounds) {
		for (int i = 0; i < numRounds; i++) {
			System.out.println("Round " + (i + 1) + ":");
			playRound();
			System.out.println();
		}
	}
}
