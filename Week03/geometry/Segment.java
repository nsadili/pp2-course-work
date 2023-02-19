package geometry;

public class Segment {
    
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;

    }

    public Segment(float x1, float y1, float x2, float y2) {

        this(new Point(x1, y1), new Point(x2, y2));
    }
 
    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {

        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }
    
 
    public void setP2(Point p2) {

        this.p1 = p2;
    }
     

         public void translate(float dX, float dY) {
            this.p1.translate(dX, dY);
            this.p2.translate(dX, dY);
         }


         public float length() {
            return this.p1.distance(this.p2);
         }
       
         public boolean equals(Segment s) {
            return this.p1.equals(s.p2) && this.p2.equals(s.p2);
         }

         public float getSlope() {
            float dX = this.p2.getX() - this.p1.getX();
            float dY = this.p2.getY() - this.p1.getY();

            return dY / dX;

         }

         public float getIntercept() {
            float m = this.getSlope();
            return this.p1.getY() - m * this.p1.getX();
         }

         public boolean isOnLine (Point p) {
            float m = this.getSlope();
            float k = this.getIntercept();

            return p.getY() == m * p.getX() + k;
         }

           public boolean isOnSegment(Point p) {
                float minX = Math.min (this.p1.getX(), this.p2.getX());
                float maxX = Math.max (this.p1.getX(), this.p2.getX());
                float minY = Math.min (this.p1.getY(), this.p2.getY());
                float maxY = Math.max (this.p2.getY(), this.p2.getY());

                return this.isOnLine(p) && p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;
            
         }
}