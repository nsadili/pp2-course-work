private float xCoordinate;
private float yCoordinate;

public Point() {
    this(10, 10);
}

public Point(float xCoordinate, float yCoordinate) {
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

public float calculateDistance(Point p) {
    float distance = (float) Math.sqrt(Math.pow(this.xCoordinate - p.xCoordinate, 2)
            +
            Math.pow(this.yCoordinate - p.yCoordinate, 2));

    distance = (float) Math.hypot(Math.pow(this.xCoordinate - p.xCoordinate, 2), Math.pow(this.yCoordinate - p.yCoordinate, 2));

    return distance;

}
