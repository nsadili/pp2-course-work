public class Main {
    public static void main(String[] args) {
        Rectangle m = new Rectangle(12.4, 15.6);
        Square ms = new Square(3.0);
        Circle msa = new Circle(3.5);

       ms.resize(1.0);
        System.out.println(ms.getArea());
    }
}