public class Point2 {
    private float xCoordinate;
    private float yCoordinate;

    public Point2() {
        this(10, 10);
    }

    public Point2(float xCoordinate, float yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public float getXCoordinate() {
        return this.xCoordinate;
    }

    public float getYCoordinate() {
        return this.yCoordinate;
    }

    public void translatePoint(float dX, float dY) {
        this.xCoordinate += dX;
        this.yCoordinate += dY;
    }

    public float calculateDistance(Point2 p) {
        float distance = (float) Math.sqrt(Math.pow(this.xCoordinate - p.xCoordinate, 2)
                +
                Math.pow(this.yCoordinate - p.yCoordinate, 2));

        distance = (float) Math.hypot(Math.pow(this.xCoordinate - p.xCoordinate, 2), Math.pow(this.yCoordinate - p.yCoordinate, 2));

        return distance;
    }

   public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (!(obj instanceof Point)) {
        return false;
    }
    Point2 other = (Point2) obj;
    return Float.compare(this.getXCoordinate(), other.getXCoordinate()) == 0
            && Float.compare(this.getYCoordinate(), other.getYCoordinate()) == 0;
}

}
