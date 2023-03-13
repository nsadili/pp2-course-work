import java.io.*;

// Movable interface is in Problem6.java
class Point implements Movable, Serializable {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Point p = (Point) obj;
        return this.x == p.getX() && this.y == p.getY();
    }

    // for problem 5
    @Override
    protected Object clone() {
        return this;
    }

    // for problem 6

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
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

class Segment implements Movable, Serializable {
    private Point A, B;

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Segment(int x1, int y1, int x2, int y2) {
        A = new Point(x1,y1);
        B = new Point(x2,y2);
    }

    @Override
    public String toString() {
        return "Segment{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Segment s = (Segment) obj;
        return A.equals(s.getA()) && B.equals(s.getB());
    }

    // for problem 5
    private Segment getCopy() {
        try {
            // serialize = object to bytes
            ByteArrayOutputStream bytesOutput = new ByteArrayOutputStream();
            ObjectOutputStream output = new ObjectOutputStream(bytesOutput);
            output.writeObject(this);

            // de-serialize = bytes to object
            ByteArrayInputStream bytesInput = new ByteArrayInputStream(bytesOutput.toByteArray());
            ObjectInputStream input = new ObjectInputStream(bytesInput);
            Segment copy = (Segment) input.readObject(); // up-casting

            return copy;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    protected Object clone() {
        return getCopy();
    }

    // for problem 6
    @Override
    public void moveUp() {
        A.moveUp();
        B.moveUp();
    }

    @Override
    public void moveDown() {
        A.moveDown();
        B.moveDown();
    }

    @Override
    public void moveLeft() {
        A.moveLeft();
        B.moveLeft();
    }

    @Override
    public void moveRight() {
        A.moveRight();
        B.moveRight();
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Segment s1 = new Segment(1, 1, 2, 2);
        Segment s2 = new Segment(1, 1, 2, 2);
        if(s1.equals(s2)) {
            System.out.println("Equal. Because the coordinates are equal to each other.");
        }
        else {
            System.out.println("Different");
        }
    }
}
