package pp2.week03.geometry;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x=3;
        this.y=5;
    }

    public Point(float x, float y) {
        this.x=x;
        this.y=y;
    }

    public Point(Point p) {
        this.x=p.getX();
        this.y=p.getY();
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x=x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y=y;
    }

    public void translate(float dX, float dY) {
        this.x+=dX;
        this.y+=dY;
    }

    public float distance(Point p) {
        float dist= (float) Math.sqrt(Math.pow(p.getX()-this.x, 2)+Math.pow(p.getY()-this.y, 2));
        return dist;
    }

    public boolean equals(Point p) {
        if(this.x==p.getX() & this.y==getY()) return true;
        else return false;
    }
}
