

public class TestRectAndSquare {
    public static void main(String[] args) throws CloneNotSupportedException{
        Rectangle r1 = new Rectangle(2, 5);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(2, 5);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

        Object o1 = new Rectangle(2, 5);
        Object o2 = new Rectangle(3, 3);
        Object o3 = new Square(3);

        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o2.equals(o3));

        Object o4=(Rectangle) r1.clone();
        System.out.println(r1==o4);
        System.out.println(r1.equals(o4));



    }
}
