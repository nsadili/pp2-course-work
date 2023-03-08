package Week06.Ex7;

import java.util.Scanner;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        setSide(side);
    }

    public Square(double side, String color, boolean filled) {
        setSide(side);
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }

    @Override
    public void setWidth(double side) {
        // TODO Auto-generated method stub
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        // TODO Auto-generated method stub
        super.setLength(side);
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public double getSide(){
        return super.length;
    }

    @Override
    public void resize() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Resize Square:");

            System.out.println("type: side: ");
            double side = sc.nextDouble();

            System.out.println("type: color: ");
            String color = sc.nextLine();

            System.out.println("type: is Square filled (true or false): ");
            boolean filled = sc.nextBoolean();
            
            setSide(side);
            setColor(color);
            setFilled(filled);
        }
    }

}
