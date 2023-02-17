package Week04;
import java.awt.Point;
public class Point {
    private int x;
    private int y;
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY () {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double getDistance(Point p){
        return Math.sqrt(Math.pow((this.x - p.x),b:2)+Math.pow((this.y - p.y),b:2)));
    }
    public double getClosePole(){
        Point north = new Point (x:0,y:1)
        Point south = new Point (x,y)
        Point east = new Point (x,y)
        Point west = new Point (x,y)


    }
}
