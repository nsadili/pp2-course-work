package Week05;

public class Square extends Rectangle{
    int side ;
    public Square(int side)
    {
        super(side, side);
    }

    public int getSide()
    {
        return side;
    }
}