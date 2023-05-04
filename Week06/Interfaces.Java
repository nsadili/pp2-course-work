public interface My2DInt {
    double getArea();
    double getPerimeter();
}

public interface My3DInt {
    double getSurfaceArea();
    double getVolume();
}

public class Rectangle implements My2DInt {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Cuboid implements My3DInt {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }
}

Rectangle r1 = new Rectangle(4, 5);
Square s1 = new Square(4);
Cuboid c1 = new Cuboid(2, 3, 4);

System.out.println("Rectangle area: " + r1.getArea()); // 20.0
System.out.println("Rectangle perimeter: " + r1.getPerimeter()); // 18.0
System.out.println("Square area: " + s1.getArea()); // 16.0
System.out.println("Square perimeter: " + s1.getPerimeter()); // 16.0
System.out.println("Cuboid surface area: " + c1.getSurfaceArea()); // 52.0
System.out.println("Cuboid volume: " + c1.getVolume()); // 24.0
