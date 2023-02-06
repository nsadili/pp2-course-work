import java.util.Scanner;

public class MinMax {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float num = scan.nextFloat();

        int min = 1000;
        int max = 0;

        int m = (int)num;

        while(scan.hasNextInt()) {
          
              if (m < min) 
                min = m;
        }

        while(scan.hasNextInt()) {

              if (m > max) 
                max = m;
        }
            
            System.out.println(min);
            System.out.println(max);

        }
    }
