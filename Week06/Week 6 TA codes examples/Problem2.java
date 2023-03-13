class Rectangle extends Shape implements Resizable {
    private double width, length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle r = (Rectangle) obj; // up-casting
        return length == r.getlength() && width == r.getWidth();
    }

    // for Problem 4
    @Override
    protected Object clone() {
        return this;
    }

    // for Problem 4
    @Override
    public String toString() {
        return "Rectangle[" +
                super.toString() +
                ", width=" + width +
                ", length=" + length +
                ']';
    }

    // for Problem 7

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }

    // Resizable interface methods to implement

    @Override
    public void resize() {
        length = 1;
        width = 1;
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,  10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
    }
}
