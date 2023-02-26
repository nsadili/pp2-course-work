package Week05.EX.Ex10;

public class OverPoint extends Point{
    private float x,y;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point p = (Point) obj;
        return (this.x == p.getX() && this.y == p.getY());
    }
}

