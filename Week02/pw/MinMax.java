import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        float min = 1000;
        float max = -1000;

        while(sc.hasNextFloat()){
            float num = sc.nextInt();
            if(num < min)
                min = num;
            else if
                (num > max)
                max = num;
            
        }
        System.out.println(min + " is a minumum number, " + max + " is a maximum number.");
        
    }
}
