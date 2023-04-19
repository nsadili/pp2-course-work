package Week11;

public class Main {
    public static void main(String[] args) {
        AFuncInt f = new AFuncInt() {

            @Override
            public void apply(String str) {
                System.out.println("Anonymous -> " + str);
            }
            
            @Override
        public void print(String str1, String str2){
            System.out.println("OVERRIDDEN -> " + str1 + " <==> " + str2);
        }
        };
      

        AFuncInt.print("Hello");
        f.print("Hello", "World");
        f.apply("Nijat");
        AFuncInt lambda = (str) -> System.out.println("Lambda -> " + str);

        System.out.println("-------------------");

        lambda.print("Nijat", "Aykhan");
        lambda.apply("Nijat");

    }
}
