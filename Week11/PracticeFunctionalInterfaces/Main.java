package Week11.PracticeFunctionalInterfaces;

public class Main {
    public static void main(String[] args) {
        AFuncInt func = new AFuncInt() {
            @Override
            public void apply(String str) {
                System.out.println("Anonymous -> " + str);
            }
    
            @Override
            public void print(String str1, String str2) {
                System.out.println("Overriden -> " + str1 + " " + str2);
            }
        };
    
        func.apply("Programming");
        AFuncInt.print("Programming");
        func.print("Programming", "Principles");
    
        AFuncInt lambda = string -> System.out.println("Lambda -> " + string);

        lambda.apply("Hello");
        lambda.print("Hello", "World");
        
    }
}
