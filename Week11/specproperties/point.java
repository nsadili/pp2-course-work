package specproperties;

public class point {
    private int x, y;

    point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    @Override
    public String toString() {
        
        return String.format("X:%d , Y:%d",x,y);
    }
}
