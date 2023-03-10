public class Point implements Movable {
    private int x, y;

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

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}

/* moveUp() Method:

Point p = new Point(0, 0);
p.moveUp();
System.out.println(p.getX() + ", " + p.getY()); // prints "0, -1"
*/