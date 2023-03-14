package Week06;


public class ResizableInterface {
    public static void main(String[] args) {
        Shape circle = new Circle(new Point(1,1), 3);
        Rectangle rectangle = new Rectangle(6,8);
        Square square = new Square(10);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
