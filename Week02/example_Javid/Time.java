import java.util.Scanner;


public class Time {
    
    public static  void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            var i =scan.nextInt();
            var min=i*60;
            var hour=min*60;
            System.out.println(min);
            System.out.println(hour);
        }
    }
    
}
