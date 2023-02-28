public class Main {
    public static void main(String[] args) {
        Object M1 = new Rectangle(3, 5);
        Object M2 = new Rectangle(14, 14);
        Object M3 = new Square(14);
        System.out.println(M2.equals(M3));
    }
}