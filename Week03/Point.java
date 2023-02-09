package Week03;
import java.util.Scanner;
public class Point {
    private float x;
    private float y;

    public Point(){

    }

    public Point(float x, float y){
        this.x =x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY( float y){
        this.y =y;
    }

    public void translate( float dx, float dy){
        this.x += dx;
        this.y += dx;
    }

    public float distance( Point p ){
        float dx = this.x -p.x;
        float dy = this.y - p.y;

        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
