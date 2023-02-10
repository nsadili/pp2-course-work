import java.util.Random;

public class RollingDie
 {
  public static void main(String[] args)
   {
    Random rand = new Random();

    double roll = rand.nextDouble();
    int res;

    if (roll < 1.0/8.0) 
    {
      res = 1;
    } 
    else if (roll < 2.0/8.0)
    {
      res = 2;
    } 
    else if (roll < 3.0/8.0)  
    {
      res = 3;
    }
     else if (roll < 4.0/8.0) 
    {
      res = 4;
    }
    else if (roll < 6.0/8.0) 
    {
      res = 5;
    } 
    else 
    {
      res = 6;
    }
    System.out.println(res);

    //Not sure about the code. it was confusing
  }
}