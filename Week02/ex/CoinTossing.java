import java.util.Scanner;
public class CoinTossing {
   
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       var Trails=scan.nextInt();
       double res=0.0;
       for(int i=1; i<=Trails;i++){
           res= Math.random();
        }
        if(res<0.5){
            System.out.println("HEAD");
        }
        else{
            System.out.println("TAIL");
        }
    }

}
