public class Point implements Cloneable, Movable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    protected Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }

    //Interface methods

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

/*
 * We've implemented the clone() method for the Point class which is a shallow
 * clone, because we're only copying the values of the x and y fields. This
 * means that if the Point object contains any references to other objects,
 * those references will not be cloned and will still refer to the same objects
 * as the original Point.
 */