package Week06;

abstract class Shape {
    protected String color = "red";
    protected Boolean filled = true;

    public Shape(int side, int side2) {
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

    @Override
    public String toString() {
        return "Shape[" +
                "color=" + color +
                ", filled=" + filled +
                ']';
    }
}

interface Resizable {
    void resize();
}
