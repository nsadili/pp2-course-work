package ex;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
public class MovableInterface implements Movable {

    private float x;
    private float y;

    public MovableInterface(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public double distance(MovableInterface p) {
        double dist = Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
        return dist;
    }

    public boolean equals(MovableInterface p) {
        return this.x == p.getX() && this.y == p.getY();
    }

    public String toString() {
        return "X : " + x + ", Y : " + y;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }
}
