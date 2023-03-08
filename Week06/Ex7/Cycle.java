package Week06.Ex7;

import java.util.Scanner;

public class Cycle extends Shape {
    protected double radius = 1.0;

    public Cycle() {
    }

    public Cycle(double radius) {
        this.radius = radius;

    }

    public Cycle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimetr() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Cycle[" + super.toString() + ",radius = " + radius + "]";
    }

    @Override
    public void resize() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Resize Cycle:");

            System.out.println("type: radius: ");
            double radius = sc.nextDouble();

            System.out.println("type: color: ");
            String color = sc.nextLine();

            System.out.println("type: is Cycle filled (true or false): ");
            boolean filled = sc.nextBoolean();
            
            setRadius(radius);
            setColor(color);
            setFilled(filled);
        }
    }

}
