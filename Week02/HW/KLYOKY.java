import java. util. *;

public class KLYOKY {
public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Year: ");
	    	int year = sc.nextInt();
      //  double leapYear = year/4;
        if(year%4==0) {
            System.out.print("Leap Year");
        } else {
            System.out.print("Not a leap year");
        }

        sc.close();
    }
 }
