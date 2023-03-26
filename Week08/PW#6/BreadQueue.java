import java.util.PriorityQueue;

public class BreadQueue {
    public static void main(String[] args) {
        int[] breadPerPerson = {1, 2, 1, 3, 2}; // number of pieces of bread per person
        int breadInStore = 7; // amount of bread in the store

        int numPersons = maxPersons(breadPerPerson, breadInStore);
        System.out.println("Number of persons who can buy bread: " + numPersons);
    }

    static class Person implements Comparable<Person> {
        int numBread; // number of pieces of bread the person wants to buy
        int order; // order in which the person joined the queue

        public Person(int numBread, int order) {
            this.numBread = numBread;
            this.order = order;
        }

        @Override
        public int compareTo(Person other) {
            // order by number of pieces of bread, then by order in queue
            if (this.numBread == other.numBread) {
                return Integer.compare(this.order, other.order);
            } else {
                return Integer.compare(this.numBread, other.numBread);
            }
        }
    }

    static int maxPersons(int[] breadPerPerson, int breadInStore) {
        PriorityQueue<Person> queue = new PriorityQueue<>();

        // add each person to the queue
        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.add(new Person(breadPerPerson[i], i));
        }

        int numPersons = 0;
        while (!queue.isEmpty() && breadInStore > 0) {
            // sell bread to the next person in the queue
            Person nextPerson = queue.remove();
            if (breadInStore >= nextPerson.numBread) {
                breadInStore -= nextPerson.numBread;
                numPersons++;
            }
        }

        return numPersons;
    }
}
