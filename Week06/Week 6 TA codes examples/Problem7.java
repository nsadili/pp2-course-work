abstract class Shape {
    protected String color = "red";
    protected Boolean filled = true;

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

public class Problem7 {
    public static void main(String[] args) {
        Shape circle = new Circle(new Point(1,1), 3);
        Shape rectangle = new Rectangle(6,8);
        Shape square = new Square(10);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
