import java.util.LinkedList;
import java.util.Queue;

public class ex5 {
    public static void main(String[] args) {
        int breadPerPerson[] = {1, 2, 1, 1, 5, 3, 1, 4, 2};
        int breadInShelf = 21;
        
        System.out.println(peopleCanBuyBread(breadPerPerson, breadInShelf));
    }

    public static int peopleCanBuyBread(int[] breadPerPerson, int breadInShelf) {
        Queue<Integer> q = new LinkedList<Integer>();

        for (int x: breadPerPerson) {
            q.add(x);
        }

        int people = 0;
        int breadTaken = 0;
        while (!q.isEmpty() && breadTaken < breadInShelf) {
            if (q.peek() <= breadInShelf - breadTaken) {
                breadTaken += q.poll();
                people++;
            }
            else break;
        }

        return people;
    }
}
