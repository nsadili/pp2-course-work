package Week06;

public class Testing {
    public static void main(String[] args) {
        Rectangle rt1 = new Rectangle(5,10);
        Rectangle rt2 = new Rectangle(15,10);
        Rectangle rt3 = new Rectangle(5,10);

        System.out.println(rt1.equals(rt2));
        System.out.println(rt1.equals(rt3));
    }
}
