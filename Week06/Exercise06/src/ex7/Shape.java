package ex7;

public abstract class Shape {
    protected String color = "red";
    protected Boolean filled = true;

    public Shape() {}

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
