package pp2.week03.geometry;
public class Point{
    
        private float x;
        private float y;
        
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
     public float getX(){
      return this.x;
     }
    public float getY()   {
        return this.y;
    } 

}

