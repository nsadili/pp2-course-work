public class TestShape {
    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2(7, 4);

        Rectangle2 r2 = new Rectangle2(5, 6);

        Square2 s1 = new Square2(4);

        Circle c1 = new Circle(3);

        System.out.println(r1.resize(5));

        System.out.println(r2.resize(5));

        System.out.println(s1.resize(2));

        System.out.println(c1.resize(6));
    }
}
