public class PracticeFuntionalInterfaces {
    public static void main(String[] args) {
        AFuncInt a = new AFuncInt() {
            @Override
            public void apply(String s) {
                System.out.println(s);
            }
        };
        a.apply("Javid");
        AFuncInt.print("Javid");
        a.print("Javid", "Ibadov");
        AFuncInt a2 = (s) -> System.out.println(s);
        a2.apply("Javid");
        AFuncInt.print("Javid");
        a2.print("Javid", "Ibadov");
    }
}

interface AFuncInt {
    void apply(String s);
    static void print(String s) {
        System.out.println(s);
    }
    default void print(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }
} 
