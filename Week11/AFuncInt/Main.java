package AFuncInt;

public class Main {
    public static void main(String[] args) {

        AFuncInt f = new AFuncInt() {

            @Override
            public void apply(String str) {
                System.out.println("Anonymous -> " + str);
            }
            @Override
            public void print(String str1, String str2) {
                    System.out.println("OVERRIDEN -> " + str1 + " <==> " + str2);
                }
            

        };

        AFuncInt lambda = (str) -> System.out.println("Lambda -> " + str);

        AFuncInt.print("Hello"); // you can not call it 
        f.print("Hello", "World");
        f.apply("Nuraddin");

        System.out.println("===================================");
       
        lambda.print("Hello", "World");
        lambda.apply("Nuraddin");
    }
}
