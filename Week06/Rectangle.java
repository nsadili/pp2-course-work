
public class Rectangle extends Shape implements Cloneable, Resizeable {
    protected double a = 1, b = 1; // a width b- lenght since class defined as it, I di not change a into widht and
                                   // so on.

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a, double b, String color, boolean filled) {
        this.a = a;
        this.b = b;
        this.color = color;
        this.filled = filled;

    }

    public void setWidth(double width) {
        this.a = width;
    }

    public void setLength(double length) {
        this.b = length;
    }

    public double getWidth() {
        return this.a;
    }

    public double getLength() {
        return this.b;
    }

    public String toString() {
        return "Rectangle " + super.toString();
    }

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;
        if (!(obj instanceof Rectangle))
            return false;

        Rectangle that = (Rectangle) obj;
        return that.a == this.a && that.b == this.b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimetr() {
        return 2 * (this.a + this.b);
    }

    @Override
    public void resize(double size) {
        this.a *= size;
        this.b *= size;
    }

}
