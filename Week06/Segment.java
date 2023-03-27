import java.awt.Point;
import java.util.Objects;

public class Segment implements Cloneable {
    public Point p1;
    public Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.p1 = new Point((int) x1, (int) y1);
        this.p2 = new Point((int) x2, (int) y2);
    }

    public Point getP1() {
        return this.p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP2(Point p2) {
        this.p1 = p2;
    }

    public float length() {
        return (float) Math.hypot(p1.x - p2.x, p1.y - p2.y);
    }

    public boolean equals(Segment s) {
        return Objects.equals(this.p1, s.p1) && Objects.equals(this.p2, s.p1)
      }

    public float getSlope() {
        return (float) (p2.y - p1.y) / (p2.x - p1.x);
    }

    public float getSlope(Point p1, Point p2) {
        return (float) (p2.y - p1.y) / (p2.x - p1.x);
    }

    public float getIntercept() {
        return (float) (p1.y - getSlope() * p1.x);
    }

    public boolean isOnLine(Point p) {
        return getSlope() == getSlope(this.p1, p);
    }

    public boolean isBetween(Point p) {
        return (p.x >= Math.min(this.p1.x, this.p2.x) && p.x <= Math.max(this.p1.x, this.p2.x)
                && p.y <= Math.min(this.p1.y, this.p2.y) && p.y >= Math.max(this.p1.y, this.p2.y));
    }

    public boolean isOnSegment(Point p) {
        return isOnLine(p) && isBetween(p);
    }

    public void moveUp() {
        this.p1.translate(0, 1);
        this.p2.translate(0, 1);
    }
  public void moveDown() {
        this.p1.translate(0, -1);
        this.p2.translate(0, -1);
    }

    public void moveLeft() {
        this.p1.translate(-1, 0);
        this.p2.translate(-1, 0);
    }

    public void moveRight() {
        this.p1.translate(1, 0);
        this.p2.translate(1, 0);
    }
}