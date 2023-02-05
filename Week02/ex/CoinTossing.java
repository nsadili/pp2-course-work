import java.util.Scanner;
public class CoinTossing {
    public static void main(String[] args) {
        int x1=2;
        int x2=0;
        int c=0;
        int b=0;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
        double f=Math.random();
        double a=x1*(1.00-f)+x2*f;
        if((int)a==1){
            System.out.println("Head");
            c++;
        }
        else if((int)a==0){
            System.out.println("Tail");
            b++;
        }
       
    } System.out.println("Probability of Heads: "+(double)c/n*100+"%");
        System.out.println("Probability of Tails: "+(double)b/n*100+"%");
    }
}
