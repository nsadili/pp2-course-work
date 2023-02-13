import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int i= 0;
        int sum = 0;
        for(i= a+1; i < b; i++){
            if(i%2==1){
                sum += i;
            }
        }
        System.out.println(+sum);
       
    }
}