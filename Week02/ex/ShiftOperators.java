public class ShiftOperators {
    public static void main(String[] args) {
		int a = 5, b = 255;

		System.out.printf("a)%20d -> ", a);
		System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
		System.out.printf("b)%20d -> ", b);
		System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));

		a = a >> 1;
		b = b >> 1;

		System.out.printf("After shift\na: %d\nb: %d\n", a, b);

		System.out.printf("a)%20d -> ", a);
		System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
		System.out.printf("b)%20d -> ", b);
		System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));

		a = a >> 1;
		b = b >> 1;

		System.out.printf("After shift\na: %d\nb: %d\n", a, b);

		System.out.printf("a)%20d -> ", a);
		System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
		System.out.printf("b)%20d -> ", b);
		System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
	}
}
