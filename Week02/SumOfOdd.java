import java.util.*;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input1 = sc.nextInt();
        int sum = 0;
        if(input%2==0){
            for(int i = input+1; i < input1; i+=2){
                sum+=i;
            }
        }
        else{
            for(int i = input+2; i < input1; i+=2){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
