package WEEK5.pw12;

public class Main {
    public static void main(String[] args) {
        Object o1 =new Rectangle(5, 10);
        Object o2 =new Rectangle(15, 15);
        Object o3 =new Square(15);

        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o2.equals(o3));
    }
}
