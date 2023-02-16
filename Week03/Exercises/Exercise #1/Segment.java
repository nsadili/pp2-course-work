public class Segment {
    private Point p1;
    private Point p2;

    // Constructors
    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    // Getters and Setters
    public Point getP1() {
        return p1;
    }

    public void setP1(Point p) {
        this.p1 = p;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p) {
        this.p2 = p;
    }

    // Other Methods
    public void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return this.p1.distance(this.p2);
    }

    public boolean equals(Segment s) {
        return this.p1.equals(s.getP1()) && this.p2.equals(s.getP2());
    }

    public float getSlope() {
        float deltaX = this.p2.getX() - this.p1.getX();
        float deltaY = this.p2.getY() - this.p1.getY();

        if (deltaX == 0) {
            return Float.POSITIVE_INFINITY;
        } else {
            return deltaY / deltaX;
        }
    }

    public float getIntercept() {
        return this.p1.getY() - this.getSlope() * this.p1.getX();
    }

    public boolean isOnLine(Point p) {
        float expectedY = this.getSlope() * p.getX() + this.getIntercept();
        return p.getY() == expectedY;
    }

    public boolean isOnSegment(Point p) {
        float x1 = this.p1.getX();
        float y1 = this.p1.getY();
        float x2 = this.p2.getX();
        float y2 = this.p2.getY();
        float px = p.getX();
        float py = p.getY();

        if (px < Math.min(x1, x2) || px > Math.max(x1, x2) || py < Math.min(y1, y2) || py > Math.max(y1, y2)) {
            return false;
        }

        float dx1 = px - x1;
        float dy1 = py - y1;
        float dx2 = px - x2;
        float dy2 = py - y2;
        float segmentLength = this.length();

        if (dx1 * (x2 - x1) + dy1 * (y2 - y1) > segmentLength * segmentLength || dx2 * (x1 - x2) + dy2 * (y1 - y2) > segmentLength * segmentLength) {
            return false;
        }

        return true;
    }
}