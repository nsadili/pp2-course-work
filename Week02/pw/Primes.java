import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int count=0;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                count =1;

            }
        }
    
    if(count==1){
        System.out.println("Not Prime");
    }
    else System.out.println("Prime");
}}
