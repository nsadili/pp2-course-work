package pp2.week08;
import java.util.*;
public class PriorityQueueDemo {
    public static class Person
    {
        int nofBread;

        public Person(int nofBread) {
            this.nofBread = nofBread;
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("number of people in the queue :");
        int nofPeople = scn.nextInt();

        System.out.print("number of loafs for each person :");
        int nofLoafs = scn.nextInt();

        System.out.print("number of bread in the store :");
        int nofLoafsStore = scn.nextInt();


        PriorityQueue<Person> queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.nofBread));

        for (int i = 0; i < nofPeople; i++)
        {
            queue.offer(new Person(nofPeople));
        }

        int nofPeoplebuy = 0;

        while (!queue.isEmpty() && nofLoafsStore >= queue.peek().nofBread)
        {
            Person person = queue.poll();
            nofLoafsStore -= person.nofBread;
            nofPeoplebuy++;
        }

        System.out.println("number of people who will be able to buy a loaf of bread:" + nofPeoplebuy);
    }
}
