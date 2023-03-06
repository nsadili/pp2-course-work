public class Square {
    private Rectangle rectangle;

    public Square(int side) {
        rectangle = new Rectangle(side, side);
    }

    @Override
    public int getArea() {
        return rectangle.getArea();
    }

    @Override
    public int getPerimeter() {
        return rectangle.getPerimeter();
    }
}
