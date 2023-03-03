public class Ex01 {
    public static void main(String[] args) {
        Point p1= new Point();
        Point p2= new Point(3,5);
        p1.translate(2,-1);
        p2.translate(5,2);
        Segment s1= new Segment(p1,p2);
        Segment s2= new Segment(1,2,3,4);
        System.out.println("Point 1: "+p1.toString());
        System.out.println("Point 2: "+p2.toString());
        System.out.println("Are Point 1 and Point 2 equal? "+p2.equals(p1));
        System.out.println("Segment 1:" + s1);
        System.out.println("Segment 2:" + s2);
        System.out.println("Are Segment 1 and Segment 2 equal? "+s1.equals(s2));
        
    }
}


class Point{
    private float x;
    private float y;

    public Point(){
        //EMPTY CONSTRUCTOR
        //this.x=3;
        //this.y=3;
        this(3,3);

    }
    public Point(float x, float y){
        this.x=x;
        this.y=y;

    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }

  public void translate(float dX, float dY){
    this.x += dX;
    this.y += dY;

  }
  public float distance(Point p){
    float dist =(float)Math.sqrt(
      Math.pow(p.getX()-this.x,2)
      +
      Math.pow(p.getY()-this.y,2)

    );
    return dist;

  }

 

 @Override
 public boolean equals(Object obj){
    if(obj==this){
        return true;
    }
   if(!(obj instanceof Point)){
    return false;
   }
   Point p= (Point) obj;
    return p.x==this.x && p.y==this.y;
 }

@Override
 public String toString(){
    return "["+  x + ", " +y + "]";

 }
}


class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    public Segment(float x1, float y1, float x2, float y2 ){
        this.p1= new Point(x1,y1);
        this.p2= new Point(x2,y2);

    }

    public Point getP1(){
        return p1;
    }
    
    public void setP1(Point p1){
        this.p1= p1;

    }
    public Point getP2(){
        return p2;
    }
    public void setP2(Point p2){
        this.p2= p2;

    }
    public void translate(float dx, float dy ){
        this.p1.translate(dx, dy);
        this.p2.translate(dx, dy);
    }
    public float length(){
       return this.p1.distance(this.p2);
    }
   
    public float getSlope(){
        float dx= this.p2.getX()- this.p1.getX();
        float dy= this.p2.getY()- this.p1.getY();
        return dy/dx;

    }
    public float getIntercept(){
        float m= this.getSlope();
        return this.p1.getY() - m * this.p1.getX();

    }
    public boolean isOnline(Point p){
        float m= this.getSlope();
        float b= this.getIntercept();
        return p.getY()==  m * p.getX()+b;


    }
    public boolean IsOnSegment(Point p){
        float minX= Math.min(this.p1.getX(), this.p2.getX());
        float maxX= Math.max(this.p1.getX(), this.p2.getX());
        float minY= Math.min(this.p1.getY(), this.p2.getY());
        float maxY= Math.max(this.p1.getY(), this.p2.getY());
        return this.isOnline(p) && p.getX()>= minX && p.getX() <=maxX && p.getY()>= minY && p.getY() <=maxY;
        
        


    }
    @Override
    public String toString(){
        return  this.p1+ "," + this.p2 ;
    }
    public boolean equals(Object obj){
        if(this== obj){
            return true;
        }
        Segment s= (Segment) obj;
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }
    
}

  


