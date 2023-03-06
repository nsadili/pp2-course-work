import java.util.Scanner;

public class Square extends Rectangle {
    protected double side;


    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public String toString() {
        return "Square" + super.toString() + "]";
    }

    @Override
    public void resize(double resizableTo) {
            this.side *= resizableTo;
        }
    }
