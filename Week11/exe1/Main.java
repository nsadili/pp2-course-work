package exe1;

public class Main {
    public static void main(String[] args) {

        AFuncInt func = new AFuncInt() {

            @Override
            public void apply(String str) {
                System.out.println("Anonymous -> " + str);    
            }

            @Override
            public void print(String str1, String str2) {
                System.out.println("Default -> " + str1 +str2);    
            }
        };

        // func.apply("Programming");
        // AFuncInt.print("ADA University");
        // func.print("School of ", "IT"); //calling print method from anonymous class and its parent class

        AFuncInt lambda = s -> System.out.println("Lambda -> " + s);;

        lambda.apply("Hello");
        lambda.print("Hello", "World");

    }
    
}
