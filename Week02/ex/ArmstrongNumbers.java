import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        //  Scanner scanner= new Scanner(System.in);                         VARIANT A
        // int a=scanner.nextInt();
        // int b=a;
        // int res;
        // double sum=0;
        // while(a>0){
        //     res=a%10;
        //     sum=sum+Math.pow((double) res, 3);
        //     a/=10;

        // }
        // if((int)sum==b){
        //     System.out.println("It is Armstrong Number");
           
        // }else System.out.println("Not an Armstrong Number"); 


        //***********************************************************************************************

        Scanner scanner= new Scanner(System.in);                        // VARIANT B
        int a=scanner.nextInt();
        int c=scanner.nextInt();
        
        int res;
        double sum=0;
        if(c>a){
            
        for(;a<c;a++) {
            int b=a;
           if(a-1==(int)sum){
            System.out.println(a-1);
           }
           sum=0;
            while(a>0){
                res=a%10;
                sum=sum+Math.pow( (double) res,3);
                a/=10;
            
                }
        
            a=b;
            }
        }
        else if(a>c){
            
            for(;a>c;c++) {
                int b=c;
               if(c-1==(int)sum){
                System.out.println(c-1);
               }
               sum=0;
                while(c>0){
                    res=c%10;
                    sum=sum+Math.pow( (double) res,3);
                    c/=10;
                
                    }
            
                c=b;
                }
            }
    
    }
}
