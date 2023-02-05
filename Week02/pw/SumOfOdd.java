import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int sum=0;
        if(a>b){
            for(;b<a;b++){
                if(b%2==1){
                    sum=b+sum;
                }

            }
            System.out.println(sum);
        }
        else if(a<b){
            for(;b>a;a++){
                if(a%2==1){
                    sum=a+sum;
                }

            }
            System.out.println(sum);
        }
    }
}
