public class AFuncIntTest {
    public static void main(String[] args) {

        // we can  create object of interface when we mention class inside of it
        AFuncInt f1 = new AFuncInt() {
            @Override
            public void apply(String s){
                System.out.println(s);
            }
        };
        
        AFuncInt f2 = (String s) -> System.out.println(s);

        f1.apply("Test");

        f2.apply("Test1");
    }
}
