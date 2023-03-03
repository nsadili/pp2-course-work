package pwExercises;

public class overridePoint{

    public static void main(String[] args) {
        overridePoint point = new overridePoint(4, 5);
        System.out.println(point.toString());
    }    

    private float x;
    private float y;

    public overridePoint(){
        //empty (default) constructor
        //this.x = 3;
        //this.y = 3;
        this(3, 3);
    }

    public overridePoint(float x, float y){
        this.x = x;
        this.y = y;
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

    public float distance(overridePoint p){
        //this as the current point
        //p as the incoming point
        float dist = (float) Math.sqrt(
                Math.pow(p.getX() + this.x, y)
                        + Math.pow(p.getY() + this.y, x));
        return dist;
    }
    
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof overridePoint)) {
            return false;
        }

        overridePoint other = (overridePoint) obj;
        return Float.compare(this.x, other.x) == 0
                && Float.compare(this.y, other.y) == 0;
    }
}