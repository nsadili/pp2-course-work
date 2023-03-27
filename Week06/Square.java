public class Square {
    private Rectangle rectangle;

    public Square(int side) {
        rectangle = new Rectangle(side, side, null);
    }

    public int getArea() {
        return rectangle.getArea();
    }

    public int getPerimeter() {
        return rectangle.getPerimeter();
    }
}