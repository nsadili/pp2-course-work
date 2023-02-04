
    import java.util.Scanner;

public class Average {

    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        //scan.hasNextInt();
        //scan.nextInt();

        var cnt=0;
        var sum=0;

        while (scan.hasNextInt()){
            sum+=scan.nextInt();
            cnt++;
        }
        var avg = (float) sum / cnt;
        System.out.println(avg);
    }
}
