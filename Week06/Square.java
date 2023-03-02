package Week06;

public class Square extends Rectangle {
    private Integer side;

    public Square(Rectangle rectangle, Integer side) {
        super(rectangle.getHeight(), rectangle.getWidth());
        this.side = side;
    }

    public Integer getSide() {
        return side;
    }

    //@Override
    public boolean equals(Square square) {
        //if (this == o) return true;
        //if (!(o instanceof Square)) return false;
        //Square square = (Square) o;
        return getHeight().equals(square.side) && getWidth().equals(square.side);
    }
}
