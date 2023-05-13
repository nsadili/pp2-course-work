public class Main {
    public static void main(String[] args) {
        // Create an instance of AFuncInt using anonymous classes
        AFuncInt anonInstance = new AFuncInt() {
            @Override
            public void apply(String str) {
                System.out.println("apply(): " + str);
            }
        };

        // Call the methods of the anonymous instance
        anonInstance.apply("Anonymous instance apply()");
        AFuncInt.print("Anonymous instance print()");
        anonInstance.print("Anonymous", "instance print()");

        // Create an instance of AFuncInt using lambda expressions
        AFuncInt lambdaInstance = str -> System.out.println("apply(): " + str);

        // Call the methods of the lambda instance
        lambdaInstance.apply("Lambda instance apply()");
        AFuncInt.print("Lambda instance print()");
        lambdaInstance.print("Lambda", "instance print()");
    }
}
