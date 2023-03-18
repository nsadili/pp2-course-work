import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ex6 {
    public static void main(String[] args) {
        //                      1, 1, 1, 1, 2, 2, 3, 4, 5
        int breadPerPerson[] = {1, 2, 1, 1, 5, 3, 1, 4, 2};
        int breadInShelf = 15;
        
        System.out.println(maxPeopleCanBuyBread(breadPerPerson, breadInShelf));
    }

    public static int maxPeopleCanBuyBread(int[] breadPerPerson, int breadInShelf) {
        LinkedList<Integer> l = new LinkedList<Integer>();

        for (int x: breadPerPerson) {
            l.add(x);
        }

        Collections.sort(l);
        Queue<Integer> q = l;

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
