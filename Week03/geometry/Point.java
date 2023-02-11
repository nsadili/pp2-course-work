package geometry;

public class Point {
    private float x; //field
    private float y;

    public Point() {
        //EMPTY CONTRUCTOR
    }

    public Point(float x, float y) {
        this.x=x;
        this.y=y;
    }
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x=x;
    }

    public void setY(float y) {
        this.y=y;
    }

    public void translate(float dX, float dY) {
        this.x+=dX;
        this.y+=dY;
    }

    public float distance(Point p) {
        float dist= (float) Math.sqrt(
        Math.pow(this.x-p.x, 2 ) + Math.pow(this.y-p.y, 2));
        return dist;
    }

    public boolean equals(Point p) {
        if(this.x==p.x && this.y==p.y) return true;
        else return false;
    }
    
}
