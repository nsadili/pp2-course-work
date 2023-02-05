import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Please insert the number: ");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int res=1;
        if(a>0){for(int i=1;i<=a;i++){
            res=i*res;

        }
        System.out.println("Your result is: "+res);}
        if(a==0){
            System.out.println(1);
        }
    }
}
