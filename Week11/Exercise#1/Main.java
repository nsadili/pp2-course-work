public class Main {
    public static void main(String[] args) {

        // Create an instance of AFuncInt using anonymous class
        AFuncInt anonInstance = new AFuncInt() {
            @Override
            public void apply(String s) {
                System.out.println(s.toUpperCase());
            }
        };

        // Test anonymous instance methods
        anonInstance.apply("hello world"); // Output: HELLO WORLD
        AFuncInt.print("This is a static method."); // Output: This is a static method.
        anonInstance.print("Java", "Programming"); // Output: Java Programming

        // Create an instance of AFuncInt using lambda expression
        AFuncInt lambdaInstance = (s) -> System.out.println(s.toLowerCase());

        // Test lambda instance methods
        lambdaInstance.apply("HELLO WORLD"); // Output: hello world
        AFuncInt.print("This is a static method."); // Output: This is a static method.
        lambdaInstance.print("Java", "Programming"); // Output: java programming
    
    /*
    1) The Main class has a main method which creates two instances of the AFuncInt interface, 
    one using an anonymous class and the other using a lambda expression. Later, you will point out
    that outputs will be different in both expressions.
    2) The anonymous class instance overrides the apply method, which takes a string and prints
    it to the console in uppercase. It also calls the print method of the interface with the
    static keyword, which prints a string to the console.
    3) The lambda expression instance implements the apply method, which takes a string and prints
     it to the console in lowercase. It also calls the print method of the interface, which is
      a default method that takes two strings and concatenates them with a space before printing
       to the console.
    */    
    }
}