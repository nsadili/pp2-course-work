public class Main {
    public static void main(String[] args) {
        // b. In the main method of the Main class
        // i. Create an instance of type AFuncInt (Anonymous classes)
        AFuncInt instance1 = new AFuncInt() {
            @Override
            public void apply(String input) {
                System.out.println("Anonymous class apply: " + input);
            }
        };

        // ii. Call the three methods of the instance and test if you have expected output
        instance1.apply("Hello");
        AFuncInt.print("Static print");
        instance1.print("Hello", "World");

        // iii. Create another instance using lambda expressions
        AFuncInt instance2 = (input) -> {
            System.out.println("Lambda apply: " + input);
        };

        // iv. Call the three methods of the second instance and test if you have expected output
        instance2.apply("Hello Lambda");
        AFuncInt.print("Static print Lambda");
        instance2.print("Hello Lambda", "World Lambda");
    }
}