public class RandomPointsInCircle {
    public static void main(String[] args) {
        double x, y;
        do{
            x = 2* Math.random( ) -1;
            y = 2 *  Math.random() - 1 ;
            System.out.printf("(%f,%f) is in the circle. \n", x,y);

        }
     while  ( x * x + y * y > 1.0);
   
     
        System.out.printf("(%f,%f) is outside the circle. \n", x,y);

     
     
    }
}
