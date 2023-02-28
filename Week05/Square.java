

public class Square extends Rectangle {

    private int side;

    public Square(int side)
    {
        super(side, side);

    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }



    
}
