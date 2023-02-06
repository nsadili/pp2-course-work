import java.util.Scanner;


public class Time {
    
    public static  void main(String[] args){
        Scanner scan =new Scanner(System.in);

        var sec=scan.nextInt();

        var hour=sec/3600;

        var hourq=(sec-hour*3600);

        var min=hourq/60;
      
        var minq=(hourq-min*60);

       
        var sec2 = sec-hour*3600-min*60;
        System.out.println(hour+ ":" + min + ":" +sec2);
    }
    
}
