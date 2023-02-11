package Week03.geometry;


class Point {
    private float x;
    private float y;

    Point(){

    }

    Point (float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p){
        this.x = p.x;
        this.y = p.y;
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

    public void translate (float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance (Point p) {
        float dX = this.x - p.x;
        float dY = this.y - p.y;

        return (float) Math.sqrt(dX * dX + dY * dY);
    }

    boolean equals (Point p) {
        return this.x == p.x && this.y == p.y;
    }
}
