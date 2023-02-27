package Week05.EX11;

public class main {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(3, 4);
        rectangle r2 = new rectangle(6, 8);
        rectangle r3 = new rectangle(5, 10);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
    }
}