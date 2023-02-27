package Week04;

public class ArrayOfSegments {
    public static float minLength(Segment[] arr){
        float min = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < min) {
                min = arr[i].length();
            }
        }
        return min;
    }

    public static void printArray(Segment[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Segment " + i + ": ("
                    + arr[i].getP1().getX() + ", " + arr[i].getP1().getY() + ") -> ("
                    + arr[i].getP2().getX() + ", " + arr[i].getP2().getY() + ")");
        }
    }

    public static void main(String[] args) {

        Segment[] arr = new Segment[3];
        arr[0] = new Segment(new Point(1, 2), new Point(3, 4));
        arr[1] = new Segment(new Point(0, 0), new Point(5, 5));
        arr[2] = new Segment(new Point(-1, 2), new Point(2, -2));

        System.out.println("Array of Segments:");
        printArray(arr);

        System.out.println("Minimum length: " + minLength(arr));
    }
}

class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
        float dx = this.x - p.x;
        float dy = this.y - p.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public boolean equals(Point p) {
        return this.x == p.x && this.y == p.y;
    }
}

class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float x2, float y1, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return this.p1;
    }

    public void setP1(Point p) {
        this.p1 = p;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP2(Point p) {
        this.p2 = p;
    }

    public void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return this.p1.distance(p2);
    }

    public boolean equals(Segment s) {
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }

    public float getSlope() {
        float dx = this.p2.getX() - this.p1.getX();
        float dy = this.p2.getY() - this.p1.getY();
        return dy / dx;
    }

    public float getIntercept(){
        float m = this.getSlope();
        return this.p1.getY() - m * this.p1.getX();
    }
    public boolean isOnLine(Point p){
        // y = mx + b  y == p.getY()  m == getSlope()  x = p.getX()  b = getIntercept()
        return p.getY() == getSlope() * p.getX() + getIntercept();

    }

    public boolean isOnSegment(Point p) {
        float minX = Math.min(this.p1.getX(), this.p2.getX());
        float maxX = Math.max(this.p1.getX(), this.p2.getX());
        float minY = Math.min(this.p1.getY(), this.p2.getY());
        float maxY = Math.max(this.p1.getY(), this.p2.getY());
        return this.isOnLine(p) && p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;
    }
}

