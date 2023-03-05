public abstract class Shape {

    protected String color = "red";
    protected boolean filled = true;

    public Shape() {
        this("red", true);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public abstract double getArea();

    public abstract double getPerimetr();

    @Override
    public String toString() {
        return "Shape[color:" + color + ", filled:" + this.filled + "]";
    }

}
