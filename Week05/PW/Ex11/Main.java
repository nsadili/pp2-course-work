package Week05.PW.Ex11;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = new Rectangle(15,10);
        Rectangle r3 = new Rectangle(5,10);

        System.out.println(r1.equals(r2)); // false
        System.out.println(r1.equals(r3)); // true
    }
}
