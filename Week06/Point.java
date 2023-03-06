package Week06;

public class Point {
    private float x;
    private float y;
    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
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
    public Point(){
       

    }
    public Point(float x, float y){
        this.x=x;
        this.y=y;

    }
    public Point(Point p){
        this.x=p.x;
        this.y=p.y;
        
    }
    public void translate(float dX, float dY){
        this.x+=dX;
        this.y+=dY;


    }
    public float distance(Point p){
        return (float)Math.hypot(p.x-this.x, p.y-this.y);
    }
    public boolean equals(Point p){
        return this.x==p.x&& this.y==p.y;
    }
    @Override
    public boolean equals(Object o){
        Point p= (Point) o;
        return p.x==this.x && p.y==this.y;
    }
    @Override
    public String toString(){
        return String.format("x: %.2f , y: %.2f",this.x,this.y);
    }
}
