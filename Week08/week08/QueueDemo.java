package pp2.week08;
import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("number of people in queue :");
        int nofPeople = scn.nextInt();

        System.out.print("number of loafs for each person:");
        int nofLoafs = scn.nextInt();

        System.out.print("number of loafs available in the store:");
        int nofLoafsStore = scn.nextInt();

        int nofPeoplebuy = Math.min(nofPeople , nofLoafsStore / nofLoafsStore);

        System.out.println("number of people who will be able to buy a loaf of bread : " + nofPeoplebuy);
    }
}
