public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = rect1.clone();

        System.out.println("rect1.equals(rect2): " + rect1.equals(rect2));
        System.out.println("rect1 == rect2: " + (rect1 == rect2));
    }
}
public class Rectangle implements Cloneable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}