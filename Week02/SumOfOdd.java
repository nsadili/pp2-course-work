import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();  
         int sum=0;

        for(int i=a;i<b;i++){
            if(i%2!=0) sum+=i;
        }
        System.out.println(sum);
    }
}
