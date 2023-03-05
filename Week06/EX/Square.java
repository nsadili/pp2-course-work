package EX;

public class Square extends Rectangle {
    private double side;

    public Square() {
    };

    public Square(double a) {
        super(a, a);
    }

    public Square(double a, String color, boolean filled) {
        super(a, a, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setwidth(double side) {
        this.side = side;
    }

    public void setlength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square [" + super.toString() + "]";
    }

}
