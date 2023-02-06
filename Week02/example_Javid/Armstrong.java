import java.util.Scanner;
import static java.lang.Math.PI;
public class Armstrong {
    public static void main(String[] arg){

Scanner Scan = new Scanner(System.in);


while(Scan.hasNextInt()){

    int a = Scan.nextInt();
int x=a/100;
int y=a/10%10;
int z=a%10; 

if( x*x*x+y*y*y+z*z*z ==a){
    System.out.print("Yes");
}
else   System.out.print("No");



}
    }

   
}
