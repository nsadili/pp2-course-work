package exercises;

public class Task implements FuncInter1, FuncInter2 {

	interface FuncInter1 {
		int operation(int a, int b);
	}

	interface FuncInter2 {
		void sayMessage(String message);
	}

	public static void main(String[] args) {

		FuncInter1 add = (int x, int y) -> (x + y);
		FuncInter1 mult = (int x, int y) -> (x * y);
		FuncInter1 max = (int x, int y) -> (x > y) ? x : y;

		System.out.println(add.operation(2, 7));
		System.out.println(mult.operation(2, 7));
		System.out.println(max.operation(2, 7));

		FuncInter2 print = message -> System.out.println("Message is " + message);
		print.sayMessage("\n Welcome");
	}

}
