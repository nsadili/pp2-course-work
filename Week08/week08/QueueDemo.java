package pp2.week08;
import java.util.*;
public class QueueDemo
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("How many people are in the queue? :");
        int numPpl = scn.nextInt();

        System.out.print("How many loafs does each person want? :");
        int numLoafperPpl = scn.nextInt();

        System.out.print("How many loafs are available in the store? :");
        int numLoafinStore = scn.nextInt();

        int numPplServed = Math.min(numPpl, numLoafinStore / numLoafperPpl);

        System.out.println("How many people can buy a loaf of bread? : " + numPplServed);
    }

}
