import java.util.Scanner;
import static java.lang.Math.PI;
public class ArmstrongB {
    public static void main(String[] arg){

Scanner Scan = new Scanner(System.in);




int a = Scan.nextInt();
int b = Scan.nextInt();
for(int i=a;i<b;i++){
int x=i/100;
int y=i/10%10;
int z=i%10; 

if(x*x*x+y*y*y+z*z*z==i){

    System.out.println(i);
}
}

}
    

   
}
