package math;

public class ComplexTest {
	public static void main(String[] args) {
		ComplexNumbers a = new ComplexNumbers(22, 5);
		ComplexNumbers b = new ComplexNumbers(2, 44);

		System.out.println("Complex number a: " + a);
		System.out.println("Complex number b: " + b);

		ComplexNumbers c = a.add(b);
		System.out.println("a + b = " + c);

		ComplexNumbers d = a.subtract(b);
		System.out.println("a - b = " + d);

		ComplexNumbers e = a.multiply(b);
		System.out.println("a * b = " + e);

		ComplexNumbers f = a.conjugate();
		System.out.println("Conjugate of a: " + f);

		System.out.println("Real part of a: " + a.re());
	}
}
