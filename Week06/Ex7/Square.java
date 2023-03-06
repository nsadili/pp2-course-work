package Week06.Ex7;

public class Square extends Rectangle implements Resizable {

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" + color + ", filled=" + filled + "]" + ", width=" + width + ", length="
                + length + "]";
    }

    @Override
    public void resize(double percent) {
        width *= (1 + percent / 100);
        length *= (1 + percent / 100);

    }

}