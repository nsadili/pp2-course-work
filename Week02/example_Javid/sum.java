
import java.util.Scanner;

import javax.swing.plaf.synth.SynthMenuUI;
public class sum{
    public static void main (String[] args){
int sum=0;
        Scanner input= new Scanner(System.in) ;
        System.out.print( "num1 : ");
        int a = input.nextInt();
        System.out.print( "num2 : ");
        var b =input.nextInt();
        for(int i=a+1;i<b;i++){
    if(i%2!=0){
       sum =i+sum;
    }

        }
        
        System.out.print( a+" "+ b + " sum: "+sum);
    }
}