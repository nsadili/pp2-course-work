import java.util.Scanner;
public class printingPatterns {
    public static void main(String[] args){
        var obj = new Scanner(System.in);
        int a = obj.nextInt();
        for(int i=0;i<a;i++){
            for(int ii=0;ii<a;ii++){
                if((i+ii)%2==0){
                    System.out.print("*");
                }else{
                    System.out.print("#");
                }
            }
            System.out.print("\n");
        }
    }
}
