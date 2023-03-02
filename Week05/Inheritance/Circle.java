package Inheritance;

public class Circle extends Shape {

    public Circle() {
        super("Circle figure");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("My name is " + c.getShapeName());
    }
    

}
