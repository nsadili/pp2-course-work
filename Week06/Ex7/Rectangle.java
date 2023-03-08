package Week06.Ex7;

import java.util.Scanner;

public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
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

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return width * length;
    }

    @Override
    double getPerimetr() {
        // TODO Auto-generated method stub
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Rectangle[" + super.toString() + ",width = " + width + ",length = " + length + "]";
    }

    @Override
    public void resize() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Resize Rectangle:");

            System.out.println("type: width: ");
            double width = sc.nextDouble();

            System.out.println("type: length: ");
            double length = sc.nextDouble();

            System.out.println("type: color: ");
            String color = sc.nextLine();

            System.out.println("type: is Rectangle filled (true or false): ");
            boolean filled = sc.nextBoolean();
            
            setLength(length);
            setWidth(width);
            setColor(color);
            setFilled(filled);
        }
    }

}
