package Week06;

public class Square extends Rectangle {

    public Square(){}
    public Square(int side) {
        super(side, side);
    }

    public Square(int side, String color, boolean filled) {
        super(side, side, color ,filled);
    }
}