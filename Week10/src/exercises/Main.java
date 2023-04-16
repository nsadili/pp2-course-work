package exercises;

public class Main {
	interface AFunction {

		void apply(String str);

		static void print(String str) {
			System.out.println(str);
		}

		default void print(String str1, String str2) {
			System.out.println(str1 + " " + str2);
		}
	}

	public static void main(String[] args) {
		AFunction printMessage1 = message -> System.out.println(message);
		printMessage1.apply("Hello");

		AFunction.print("Hello");
		printMessage1.print("hello", "Hi");

//		AFunction printMessage2 = (message, message2) -> System.out.println(message + "  " + message2);
	}
}
