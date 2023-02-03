import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int time;

        Scanner sc=new Scanner(System.in);

        time=sc.nextInt();

        int hour=0;
        int min=0,sec=0;

        min=time/60;
        sec=time%60;

        if(min>=60){
            hour=min/60;
            min=min%60;
        }

        System.out.printf("%d hour: %d min: %d sec",hour,min,sec);;

    }
}
