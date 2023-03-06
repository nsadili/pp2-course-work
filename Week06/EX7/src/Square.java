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
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to add or multiply the side with  entered digit?");
        String s = scan.nextLine();
        if (s.contains("a")) {
            this.side += resizableTo;
        } else {
            this.side *= resizableTo;

        }
    }
}
