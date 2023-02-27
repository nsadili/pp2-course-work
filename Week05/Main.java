package Week05;

public class Main {
    public static void main(String[] args) {

        System.out.println("This part is testing PW 11:");

        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

        System.out.println();
        System.out.println("This part is testing PW 12:");

        Object o1 = new Rectangle(5, 10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);

        System.out.println("Objects are ideatical: " + o1.equals(o2));
        System.out.println("Objects are ideatical: " + o1.equals(o3));
        System.out.println("Objects are ideatical: " + o2.equals(o3));

    }
}
