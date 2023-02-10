import pp2.week03.geometry.Segment;
public class Mains {
    public static void main(String[] args){

        Point p1=new Point();
        Point p2 =new Point(4,5);
    Segment s=new Segment( p1,p2);

}

public Segment (float x1,float y1,float x2,float y2){
    this.p1=new Point(x1,x2);
    this.p2=new Point(x2,y2);
}
}
