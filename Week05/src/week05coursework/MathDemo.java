package week05coursework;

public class MathDemo {

	public int min(int a, int b) {
		return Math.min(a, b);
	}

	public int max(int a, int b) {
		return Math.max(a, b);
	}

	public int sum(int[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		return sum;
	}

	public float mean(int[] args) {
		if (args.length == 0) {
			return 0.0f;
		}
		return (float) sum(args) / args.length;
	}

	public int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial undefined for negative integers");
		}
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

}
/*
 * The advantage of defining these methods as static is that 
 * they can be called directly on the class without the need for an instance of the class. 
 */
 