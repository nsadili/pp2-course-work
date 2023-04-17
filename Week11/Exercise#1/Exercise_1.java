@FunctionalInterface /*
Writing of @FunctionalInterace means that we label our interface as a functional one.
Why do we need functional interface? The using of it is reasoned by the only abstract method and 
infinite amount of normal ones.
 */
interface AFuncInt //writing interface AFuncInt means we begin the creation of it.
 {
    void apply(String s);

    static void print(String s) {
        System.out.println(s);
    }

    default void print(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }

    /*
     The whole explanation of writing an interface will be explained in this comment below.
     1) void apply(String s) is a method that takes a String parameter and performs some operation
     on it, but does not return any value. We use it at the beginning to our functional interface, because it 
     specifies the behaviour of it.
     2)  static void print(String s) is a method that can be called on the AFuncInt interface
      without creating an instance of the interface. It takes a string s as input and prints it
       to the console.
    3) default void print(String s1, String s2) is another method that can be called
    on the AFuncInt interface, but this time it is a default method. Default methods
    provide a default implementation for an interface method. This method takes two 
    strings s1 and s2 as input, concatenates them with a space, and prints the resulting 
    string to the console.
    */
}



