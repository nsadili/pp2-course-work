package pp2.week08;
import java.util.*;

public class PriorityQueueDemo
{
    public static class Person
    {
        int numBread;

        public Person(int numBread) {
            this.numBread = numBread;
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("How many people are in the queue? :");
        int numPpl = scn.nextInt();

        System.out.print("How many loafs does each person want? :");
        int numLoafperPpl = scn.nextInt();

        System.out.print("How much bread is in the store? :");
        int numLoafinStore = scn.nextInt();


        PriorityQueue<Person> queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.numBread));

        for (int i = 0; i < numPpl; i++)
        {
            queue.offer(new Person(numLoafperPpl));
        }

        int numPeopleServed = 0;

        while (!queue.isEmpty() && numLoafinStore >= queue.peek().numBread)
        {
            Person person = queue.poll();
            numLoafinStore -= person.numBread;
            numPeopleServed++;
        }

        System.out.println("How many people can buy bread? :" + numPeopleServed);
    }

}