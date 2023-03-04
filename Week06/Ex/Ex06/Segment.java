package Ex06;

public class Segment implements Movable {
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
    @Override
    public Movable moveUp(int steps) {
        this.p1.moveLeft(steps);
        this.p2.moveLeft(steps);
        return this;
       
    }
    @Override
    public Movable moveDown(int steps) {
        this.p1.moveDown(steps);
        this.p2.moveDown(steps);
        return this;
    }
    @Override
    public Movable moveLeft(int steps) {
        this.p1.moveLeft(steps);
        this.p2.moveLeft(steps);
        return this;
    }
    @Override
    public Movable moveRight(int steps) {
        this.p1.moveRight(steps);
        this.p2.moveRight(steps);
        return this;
       
    }
    
}

  