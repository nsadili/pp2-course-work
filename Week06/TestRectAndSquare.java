public class TestRectAndSquare {

    int a, b;

    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r1 = new Rectangle(2, 5);
        Rectangle r2 = new Rectangle(5, 5);
        Rectangle r3 = new Rectangle(2, 5);

        Square s1 = new Square(3);
        Square s2 = new Square(5, "White", true);
        Circle c1 = new Circle();
        Circle c2 = new Circle(5, "black", false);

        System.out.println(s2);
        System.out.println(c2);
        System.out.println(r3);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimetr());

        System.out.println(c2.getArea());
        System.out.println(c2.getPerimetr());
        r1.setLength(1);
        System.out.println(r1.getArea());

        r1.resize(3);
        System.out.println(r1.getArea());
        s1.resize(2);
        System.out.println(s1.getArea());
       

        // System.out.println(r1.equals(r2));
        // System.out.println(r1.equals(r3));

        // Object o1 = new Rectangle(2, 5);
        // Object o2 = new Rectangle(3, 3);
        // Object o3 = new Square(3);
        // Object o4 = new Square(5);

        // System.out.println(o1.equals(o2));
        // System.out.println(o1.equals(o3));
        // System.out.println(o2.equals(o3));
        // System.out.println(o4.equals(r2));

        // Rectangle copy= (Rectangle) r3.clone();

        // System.out.println(copy.toString());
        // copy.set(0, 0);
        // System.out.println(copy + "----" + r3);

    }

}
