
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n, min, max;
        n = input.nextInt();
        min = max = n;
        while(input.hasNextInt()){
            n = input.nextInt();
            if(n < min) {
                min = n;
            }
            if(n > max){
                max = n;
            } 
        }
        input.close();
        System.out.printf("min: %f\nmax: %f", min, max);
    }
}



/*
import java.util.Scanner;

public class MinMax{
    public static void main(String[] args){
        int min, max;
        Scanner s = new Scanner(System.in);
        System.out.print("enter a value: ");
        int val = s.nextInt();
        min = max = val;
        while(val != 0){
            System.out.print("enter a value: ");
            val = s.nextInt();
            if(val < min){
                min = val;
            }
            if(val > max){
                max = val;
            }
        };
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
*/