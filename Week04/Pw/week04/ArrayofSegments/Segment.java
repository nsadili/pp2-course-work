package week04.ArrayofSegments;
import week04.ArrayofSegments.Segment;



  
public class Segment {
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
    public String toString(){
    return "(" + p1.toString() + "," + p2.toString()+")";

        
    }
 
    public String toString2(){
        StringBuilder sb =new StringBuilder();
        sb.append("(");
        sb.append(p1.toString());
        sb.append(",");
        sb.append(p2.toString());
        sb.append(")");
        return sb.toString();


        
    }

}
