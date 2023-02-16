import java.util.Scanner;
public class Fact {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int sum = 1;
    if(a>0) 
    {
        while(a>0){
            sum *= a;
            a-=1;

        }
        System.out.println(sum);
    
    } else System.out.println("Error");
}
}