import java.util.Scanner;

class App{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int seconds;
        int hours;
        int minutes;

        System.out.println("Enter seconds:");
        seconds=obj.nextInt();

        if(seconds<60){
            System.out.println(seconds);
        }
        else if(seconds>=60 && seconds<3600){
            System.out.println(seconds/60 + " Minutes");
            System.out.println((seconds%60)*60 + " Seconds");
        }
        else if(seconds>=3600){
            hours=seconds/3600;
            minutes=(seconds%3600)/60;
            System.out.println(seconds + " seconds is equal to:");
            seconds=seconds%60;
            System.out.println(hours + " Hours, " + minutes + " Minutes, and " + seconds + " Seconds.");
        }
}
}