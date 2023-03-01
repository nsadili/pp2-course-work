import java.util.Scanner;
public class SumOfOdd {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  int b = sc.nextInt();
        int sum=0;
        int temp;
        if(a>b)
        { 
            temp=a;
            a=b;
            b=temp;
        }
        int i;

    
        for(i=a+1; i<b; i++)
        {
            if (i%2==1)
            {
               
                sum = sum + i;
            }
        }
          System.out.println(sum);
    }
}