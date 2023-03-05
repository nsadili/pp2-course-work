public class Square2 extends Rectangle2 {
    public Square2() {

    }

    public Square2(double side) {
        super(side, side);
    }

    public Square2(double side, String color, boolean filled) {
        super(side, side);
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    public void setWidth(double side) {

        setSide(width);
    }

    public void setLength(double side) {
        setSide(length);
    }

    public String toString() {

        return "Square[Rectangle[Shape[color=" + color + ", filled=" + filled + "]=, width=" + ", length=" + length + "]]";
    }

    public Resizable resize(double num) {
        this.length *= num;
        return this;
    }
}
