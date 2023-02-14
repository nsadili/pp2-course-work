package geometry;

public class Practice {

	public static void main(String[] args) {
		
		double a = 5;
		double b = 4;
		
		double c = a++ + ++b; // a=6 b=4->	
		
		System.out.println("c value 1 = " + c);
		
		c = a++ + ++b; // a=7 b=5->6
		
		System.out.println("c value 2 = " + c);
		
		c = --a + b--; // a=7->6 b=5
		
		System.out.println("c value 3 = " + c);
		
		c = a++ - --b; // a=7 b=5->4
		
		System.out.println("c value 4 = " + c);
		
		// final values
		System.out.println("a = " + a + " b = " + b + " c = " + c);
	}
}
