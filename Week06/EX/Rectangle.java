package EX;

public class Rectangle extends Shape implements Cloneable {
    private double a, b;

    public Rectangle() {
        this.a = 1;
        this.b = 1;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a, double b, String color, Boolean filled) {
        super(color, filled);
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "Rectangle[" + super.toString() + ", width= " + a + ", lendth= " + b + "]";
    }

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Rectangle))
            return false;
        Rectangle that = (Rectangle) obj;
        return that.a == this.a && that.b == this.b;
    }

    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    @Override
    public double getArea() {

        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

}