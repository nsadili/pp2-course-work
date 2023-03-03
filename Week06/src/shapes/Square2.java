package shapes;

public class Square2 extends Rectangle2 {
    protected double side = 1.0;

    public void resize(double side) {
        setSide(side);
    }

    public Square2() {}
    public Square2(double side) {
        super(side, side);
    }
    public Square2(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[ " + super.toString();
    }

}
