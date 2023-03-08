package Week06.Ex7;

public abstract class Shape implements Resizeable{
    protected String color = "red";
    protected boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimetr();

    @Override
    public String toString() {
        return "Shape[color = " + this.color + ",filled = " + this.filled + "]";
    }



}
