package pp2.week03.geometry;
public class Point {

    private float x;
    private float y;

    public Point(){
        // this.x=3;
        // this.y=3;
        this(1,1);
    }
    
    public Point (float x, float y){
        this.x=x;
        this.y=y;
    }

    public void setX(float x){
        this.x=x;
    }

    public float getX(){
        return this.x;
    }

    public void setY(float y){
        this.y=y;
    }

    public float getY(){
        return this.y;
    }

    public void translate (float dX, float dY){
        this.x+=dX;
        this.y+=dY;
    }

    public double distance(Point p){
        double dis = Math.sqrt(Math.pow(p.getX()-this.x , 2) + Math.pow(p.getY()-this.y , 2));
        return dis;
    }

    public boolean equals(Point p){
        return p.getX()==this.x && p.getY()==this.y;
    }
}