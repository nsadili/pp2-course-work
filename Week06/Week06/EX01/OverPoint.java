package Week06.EX01;

public class OverPoint {
    private double x;
    private double y;

    public OverPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point that = (Point) obj;
        return this.x == that.getX() && this.y == that.getY();
    }
}