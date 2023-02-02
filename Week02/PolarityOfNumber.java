import java.util.*;
public class PolarityOfNumber {
public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
	    	double i = scan.nextDouble();
	    	if(i < 0) System.out.println("Negative");
	    	if(i == 0) System.out.println("Neutral");
	    	if(i > 0) System.out.println("Positive");
        
    }
 }