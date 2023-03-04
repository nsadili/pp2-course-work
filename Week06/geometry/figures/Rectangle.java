package geometry.figures;

import geometry.others.Resizable;

public class Rectangle extends Shape implements Cloneable, Resizable {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(){};
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public String toString() {
        return "Rectangle[Shape[" + this.color + ", filled = " + this.filled + ", width = " + this.width + ", length = " + this.length + "]]";
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle that = (Rectangle) obj;
        return this.width == that.width && this.length == that.length;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public void resize() {
        throw new UnsupportedOperationException("Unimplemented method 'resize'");
    }
}
