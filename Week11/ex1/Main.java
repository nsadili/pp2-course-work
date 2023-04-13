public class Main {
    public static void main(String[] args) {
        AFuncInt f = new AFuncInt() {
            @Override
            public void apply(String a) {
                System.out.println("ANONYMOUS: "+a);
            } // it is must
            @Override
            public void print(String a, String b) {
                System.out.println("OVERRIDEN: "+a+" and "+b);
            } // it is optional
        }; // anonymous class
        f.apply("HELLO");
        //f.print("HELLO");//it is static, so we cannot use it
        AFuncInt.print("HELLO");//instead of it we use it
        f.print("HELLO", "WORLD");


        AFuncInt lambda = a -> System.out.println("LAMBDA: "+a);
        lambda.apply("HELLO");
        lambda.print("HELLO", "WORLD");
    }
}
