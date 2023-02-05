import java.util.Scanner;
public class Time {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        var a=sc.nextInt();
        var h= a/3600;
        var m=(a-h*3600)/60;
        var s=a-(h*3600+m*60);
        System.out.printf("%d hours, %d minutes, and %d seconds", h, m, s);
    }
}
