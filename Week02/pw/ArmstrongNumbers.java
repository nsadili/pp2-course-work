import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        int x;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number -> ");
        x = sc.nextInt();

        var copy=x;

        var cnt=0;

        while(x>0){
            x/=10;
            cnt++;
        }
       var res=0;
       var copy2=copy;
        for(var i=1;i<=cnt;i++){
            var alfa=(copy%10);

            res+= Math.pow(alfa, cnt);
            copy/=10;

        }
        if(res==copy2){
            System.out.printf("%d is Armstrong Number",copy2);
        }else{
            System.out.printf("%d is not Armstrong Number",copy2);
        }

    
    }
}
