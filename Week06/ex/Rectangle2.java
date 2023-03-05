public class Rectangle2 extends Shape {

    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle2() {

    }

    Rectangle2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle2(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "[Rectangle[Shape[color=" + color + ", filled =" + filled + "], width= " + width + ", lenght=" + length;
    }

    public Resizable resize(double num) {
        this.length *= num;
        this.width *= num;
        return this;
    }

}
