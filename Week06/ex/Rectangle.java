

public class Rectangle extends Shape implements Cloneable{
    public double width = 1.0;
    public double length = 1.0;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle)obj;
        return rect.length == this.length && rect.width == this.width;
    }

   
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
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
        return 2 * (width + length);
    }

    
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "} " + super.toString();
    }
}
