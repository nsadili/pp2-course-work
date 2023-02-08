package Week2;
import java.util.*;
public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // 1 2 3 4 5 6 avg=21/6
        long sum = 0;
        int count = 0;
        double avg;
        while(sc.hasNextInt()){
            if(sc.hasNextInt()){
            int x = sc.nextInt(); 
            sum+=x; 
            count++;
            }
        }
        
        if(count == 0){
            System.out.println("Not any input is entered.");
            
        }else{
            avg = (double)sum/count;
            System.out.println("Sum: "+sum);
            System.out.println("Average: "+avg);
        } 
        sc.close();
    } 
}
