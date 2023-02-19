package pp2.points;
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

    public String toString(){
        return "("+getX()+", "+getY()+")";
    }

    public String toString2(){
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(getX());
        sb.append(",");
        sb.append(getY());
        sb.append(")");

        return sb.toString();
    }

    // Basically, both toString() and toString2() methods create a string representation of a point object. 
    // However, toString2() is better at making strings because it uses a StringBuilder instead of string 
    // concatenation like toString(). This saves memory and makes it faster to create the string.

}