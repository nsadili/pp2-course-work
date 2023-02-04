import java.util.Scanner;
public class taylorSin {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        double num  = obj.nextDouble();
        int n = obj.nextInt();
        double i = 0;
        double sum = 0;
        for(;n>0;n--,i++){
            double fac = 1;
            for(int a=1;a<=(2*i+1);a++){
                fac*=a;
            }
            sum += Math.pow(-1,i) * (Math.pow(num,2*i+1))/fac;
        }
        System.out.printf("Taylor sum of sin(x) is:%.4f",sum);
    }
}
