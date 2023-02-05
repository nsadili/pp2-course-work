//package rufiz_bayramov.week1;

public class RandomPointsInCircle {
   public static void main(String[] args) {
       var n = Integer.parseInt(args[0]);
       double x = 0;
       double y = 0;
       int a = 0;
       int b = 0;
       //if(x * x + y * y <= 1.0 ){
       // System.out.printf("(%f %f) is inside \n" , x , y);
       //}
       for(int i = 0; i<n ;){
       do {
         x = Math.random() * 2 - 1;
         y = Math.random() * 2 - 1;
         System.out.printf("(%f %f)Try \n" , x , y);
         a++;
       }while(x * x + y * y > 1.0);
       System.out.printf("(%f %f) is inside \n" , x , y);
       i++; 
       if(a == 1) b++;
       a = 0;
       }
       System.out.printf("%d\n" ,b);
    }
    
}
