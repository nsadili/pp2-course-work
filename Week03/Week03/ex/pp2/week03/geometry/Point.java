package pp2.week03.geometry;

public class Point{
   
        private float x;
        private float y;

        public Point(){
            // EMPTY (Default) Constructor
        }

       public Point(float x,float y){
         this.x=x;
         this.y=y;
       }

       public float getX(){
        return this.x;
       }

       public float getY(){
        return this.y;
       }
        public void translate(float x, float y) {
            this.x = x;
            this.y = y;
        }
}