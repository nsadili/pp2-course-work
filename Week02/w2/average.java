import java.util.Scanner;
public class average {
    public static void main(String [] args){
        try (Scanner scan = new Scanner(System.in)) {
            int count= 0;
            int sum = 0;
            while(scan.hasNextInt()){
                sum +=scan.nextInt();
count ++;
            }
   var avg = (float)sum/count;
System.out.println(avg);
        }


    }
}