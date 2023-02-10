import java.lang.Math;
public class ArmstrongNumbers {
public static void main(String[] args){
   
    if(args.length == 1){
        int sum = 0;
        int c = 0;
        int n = Integer.parseInt(args[0]);
        int k = n;
        int l = n;
        while(k != 0){
            c++;
            k /= 10;
        }
        while(l != 0){
            sum += Math.pow(l % 10, c);
            l /= 10;
        }
        if(sum == n) System.out.println("the number " + args[0] + " is an Armstrong number");
        else System.out.println("the number " + args[0] + " is not an Armstrong number");
    }
    else if(args.length == 2){
        int sum = 0;
        int c = 0;
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        for(int i = n; i < m; i++){
            int k = i;
            int l = i;
            while(k != 0){
                c++;
                k /= 10;
            }
            while(l != 0){
                sum += Math.pow(l % 10, c);
                l /= 10;
            }
            if(sum == i) System.out.println("the number " + i + " is an Armstrong number");
            else System.out.println("the number " + i + " is not an Armstrong number");
        }
    }
}
}
