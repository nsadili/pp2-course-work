import java.util.*;

class Parallel extends Thread 
{
  private long sum;
  private long from ,to;
  public Parallel(long from, long to, String name) 
  {
    super(name);
    this.from = from;
    this.to = to;
  }
  
  public long getCnt() 
  {
    return sum;
  }
  
  public void run() 
  {
    sum = 0;
    for (long i = from; i < to; i++) 
      if (sum % 2000000 == 0) sum += i;
  }
}

public class Main2
{
  public static void main(String[] args) 
  {
	   Parallel t1 = new Parallel(0, 2000000000L, "A");
	   Parallel t2 = new Parallel(2000000000L, 4000000000L, "B");
	   Parallel t3 = new Parallel(4000000000L, 6000000000L, "C");
	   Parallel t4 = new Parallel(6000000000L, 8000000000L, "D");
	  
    long before = System.currentTimeMillis();	  
	   t1.start(); t2.start(); t3.start(); t4.start();
	  
    try 
    {
      t1.join(); t2.join(); t3.join(); t4.join();
	   }
	   catch (InterruptedException ex) 
	   {
      System.out.println("Interrupted: " + ex);
	   }

    long after = System.currentTimeMillis();
	   long workingTime = (after - before);
    System.out.println(workingTime + " milliseconds");
      
	   long sum = t1.getCnt() + t2.getCnt() + t3.getCnt() + t4.getCnt();
    System.out.println(sum);
  }
}