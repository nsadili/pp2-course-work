import java.util.Scanner;

//package taghi_mammadov.week_02;

public class RandomPointsInCircle {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = scan.nextInt();
            double x,y;
            while(n-- > 0){
                do{
                    x = 2 * Math.random() -1;
                    y = 2 * Math.random() -1;
                    System.out.printf("\tTry: (%f, %f)\n" ,x,y);
                }

             while(x *x + y*y > 1.0);{
            if(x*x + y*y > 1.0){
                System.out.printf("(%f, %f) is in the circle.\n", x,y);
            } else {
                System.out.printf("(%f, %f) is outside the circle.\n", x,y);
            } 
   }
            
}
        }

       

            
    }
    
}
