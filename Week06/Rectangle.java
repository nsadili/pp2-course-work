public class Rectangle implements Movable {
    private int width;
    private int height;
    private Point topLeft;

    public Rectangle(int width, int height, Point topLeft) {
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Rectangle rectangle = (Rectangle) o;

        return width == rectangle.width && height == rectangle.height && topLeft.equals(rectangle.topLeft);
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}