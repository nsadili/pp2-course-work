import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args){
        System.out.printf("If you want to check a number write 0. If you want to give a range write 1: ");
        Scanner scan= new Scanner(System.in);
        var a=scan.nextInt();
        if (a==0){
            System.out.printf("Insert the number: ");
            var x=scan.nextInt();
            var x1=x;
            var cnt=0;
            var sum=0;
            while(x1!=0){
                cnt++;
                x1/=10;
            }
            x1= x;
            while(x1!=0){
                sum+=Math.pow(x1%10,cnt);
                x1/=10;
            }
            if(x==sum){System.out.println(x+" is an Armstrong number");}
            else {System.out.println(x+" is not an Armstrong number");}
        }
        else{
            System.out.printf("Insert the numbers: ");
            var x=scan.nextInt();
            var y=scan.nextInt();
            var x1=x;
            for(int i=x+1;i<y;i++){
                var i1=i;
                var cnt=0;
                var sum=0;
                while(i1!=0){
                    cnt++;
                    i1/=10;
                }
                i1= i;
                while(i1!=0){
                    sum+=Math.pow(i1%10,cnt);
                    i1/=10;
                }
                if(sum==i) {System.out.printf("%d\n",i);}
            }
        }
    }
    
}
