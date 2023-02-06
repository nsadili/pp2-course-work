import java.util.Scanner;
public class polarity {
    public static void main(String[] args){
        Scanner Scan= new Scanner(System.in);

        int a= Scan.nextInt();

        if(a<0) System.out.print("Negative");
        else if(a==0)  System.out.print("Neutral");
        else  System.out.print("Possitive");



    }
}
