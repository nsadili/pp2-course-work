import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int num;
        int sum=0,c=0;

        Scanner sc=new Scanner(System.in);

        while(sc.hasNextInt()){
            num=sc.nextInt();
            sum+=num;
            c++;
        }
        var ave=(double)sum/c;
        System.out.println(c+"--"+sum);
        System.out.println(
         
        c==0 ? "Error: n==0" : "ave:"+ ave


        );
        
    }
    
}
