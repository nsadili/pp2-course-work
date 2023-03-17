package pp2.Week03.geometry;

public class Point {
    public float x;
    public float y;

    public Point()
    {
        //this.x = 10;
        //this.y = 10;
        this(10, 10);
    }
     
     public Point(float x, float y){
        this.x = x;
        this.y = y;            
     }   
     public float getX()
     {
        return this.x;
     } 
     public float getY()

     {
        return this.y;
     }
     public void translate(float dX, float dY)
     {
        this.x += dX;
        this.y += dY;
     }
     public float distance(Point p){
       float dist =(float) Math.sqrt(
            Math.pow(this.x - p.x, 2)
            + Math.pow(this.y - p.y, 2));
        // dist = (float) Math.hypot(Math.pow)
        return dist;
     }
     public boolean equals(Point p) {
      return this.x == p.x && this.y == p.y;
  }
  

 
}