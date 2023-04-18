package FunctionalInterfacesPractice;

public class FunctionTest {
    public static void main(String[] args) {

        // Anonymous class
        Function FuncInt1 = new Function() {
            @Override
            public void apply(String input) {
                System.out.println("The input is " + input);
            }
        };

        FuncInt1.apply("Hello"); // expected output: "The input is Hello"
        Function.print("World!"); // expected output: "World!"
        FuncInt1.print("Lambda", "Expressions"); // expected output: "Lambda Expressions"

        // Lambda expression
        Function FuncInt2 = input -> System.out.println("The input is " + input);

        FuncInt2.apply("Java"); // expected output: "The input is Java"
        Function.print("Programming!"); // expected output: "Programming!"
        FuncInt2.print("Functional", "Interfaces"); // expected output: "Functional Interfaces"
    }
}
