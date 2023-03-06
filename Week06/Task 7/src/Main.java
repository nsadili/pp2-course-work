public class Main {
    public static void main(String[] args) {
        Rectangle m = new Rectangle(6.8, 7.6);
        Square ms = new Square(5.0);
        Circle msa = new Circle(2.0);

        ms.resize(1.8);
        System.out.println(ms.getPerimeter());
    }
}