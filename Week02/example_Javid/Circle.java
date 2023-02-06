import java.util.Random;
import java.util.Scanner;

public class Circle{

    public static void main(String[] args){

Random ran=new Random();
Scanner scan= new Scanner(System.in);
int n=scan.nextInt();
for(int i=0;i<n;i++){
float a,b;
int random=ran.nextInt(1);

if(random==0){
a=ran.nextFloat()-1;
}
else{
a=ran.nextFloat();
}
int random2=ran.nextInt(1);
if(random2==0){
    b=ran.nextFloat()-1;
    }
    else{
    b=ran.nextFloat();
    }
    
    System.out.print( "(" + a + "," + b + ")");


}


    }
}