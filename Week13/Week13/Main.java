package Week13;
import java.util.*;

public class Main
{
  public static void main(String[] args) 
  {
    Scanner con = new Scanner(System.in);
    long before = System.currentTimeMillis();
    
    long sum = 0;
    long cnt = 0;
    for(long i = 0; i < 8_000_000_000L; i++){
        if(i/200000 == 0)
        cnt++;
    }
      
    
    long after = System.currentTimeMillis();
    long workingTime = (after - before);
    System.out.println(workingTime + " milliseconds");
    System.out.println("counted to " + cnt);
    con.close();
  }
}