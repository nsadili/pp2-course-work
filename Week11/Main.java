@FunctionalInterface
interface AFuncInt {
    void apply(String s);
    
    static void print(String s) {
        System.out.println(s);
    }
    
    default void print(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of type AFuncInt using anonymous class
        AFuncInt instance1 = new AFuncInt() {
            @Override
            public void apply(String s) {
                System.out.println(s.toUpperCase());
            }
        };
        
        instance1.apply("hello"); // Output: HELLO
        AFuncInt.print("world"); // Output: world
        instance1.print("foo", "bar"); // Output: foo bar
        
        // Create another instance using lambda expression
        AFuncInt instance2 = (s) -> System.out.println(s.toLowerCase());
        
        instance2.apply("WORLD"); // Output: world
        AFuncInt.print("hello"); // Output: hello
        instance2.print("foo", "bar"); // Output: foo bar
    }
}
