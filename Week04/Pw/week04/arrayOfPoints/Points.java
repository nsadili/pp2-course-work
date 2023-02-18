package week04.arrayOfPoints;

public class Points {
    private int x;
    private int y;
    public Points(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double getDistance(Points p){
        return Math.sqrt(Math.pow((this.x -p.x),2)+Math.pow((this.y-p.y),2));



    }
    public String getClosestPole(){
        Points north= new Points(0,1);
        Points south= new Points(0,-1);
        Points east= new Points(1,0);
        Points west= new Points(-1,0);
       
        Points [] coordinates= {north, south, west, east};
        double [] distance = new double[4];
        for(int i=0;i<coordinates.length;i++){
            distance[i]= getDistance(coordinates[i]);

        }
       
        return findTheClosest(distance);
    
 


    }

    public String findTheClosest(double [] arr){
        double minimum= getMinimum(arr);
        
        if(minimum== arr[0]) return "North";
        if(minimum ==arr[1]) return "South";
        if(minimum==arr[2]) return "West";
        return "East";


    }



    public double getMinimum(double [] arr){
        double min= Double.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
         return min;
    }
    
    
}
