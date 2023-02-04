import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        if(args.length <2){
            System.out.println("Please,send 2 arguments");
            System.exit(1);    
        
        }

        double x=Double.parseDouble(args[0]);
        int n=Integer.valueOf(args[1]);

        // Scanner sc=new Scanner(System.in);
        // double x=sc.nextDouble();
        // int n=sc.nextInt();

       // System.out.println(x+","+n);

        var res=0.0;

        var i=0;

        for(;i<n;i++){
            
            var vv=Math.pow(-1, i) * (Math.pow(x, 2*i+1) / fact(2*i+1));
            res+=vv;
          // System.out.printf("i: %d,  %f v: \n",i,vv);
        }

        System.out.println("Result with Taylor series: "+res);
        System.out.println("Result with Math function: "+Math.sin(x));

        
    }

    public static long fact(int num){
        long res=1;
        int c=1;
        while(c<=num){
            res*=c;
            c++;
        }
        return res;
    }
}
