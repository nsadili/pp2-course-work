import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        
        Scanner scn=new Scanner(System.in);
        int res=1;
        int f=scn.nextInt();
        for(int i=1;i<=f;i++){
            res*=i;
        }
        try{
            factorial(f);
    }
        catch(IllegalArgumentException e){
        System.out.println(e);
    }
    System.out.println(res);

   
   
    }
    static void factorial(int f){
        if(f<0) throw new IllegalArgumentException("Negative number");
    }
}