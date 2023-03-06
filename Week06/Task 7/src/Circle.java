import java.util.Scanner;

public class Circle extends Shape implements Resizable{
    protected double radius = 1.0;

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString(){
        return "Circle" + super.toString() + ", radius = " + this.radius + "]";
    }

    public void resize(double m){
            this.radius *= m;
        }
    }

