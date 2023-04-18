package Week08.pw;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int tmp, breadCount, cnt = 0;
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new PriorityQueue<Integer>();
        System.out.println("Please enter the number of pieces of bread per person. Terminate the list with a negative number.");
        while (sc.hasNextInt()) {
            tmp = sc.nextInt();
            if (tmp < 0) break;
            q.add(tmp);
        }
        System.out.print("Please enter the number of pieces of bread in the store: ");
        breadCount = sc.nextInt();
        while (breadCount > 0 && !q.isEmpty()) {
            if (q.peek() > breadCount) break;
            breadCount -= q.poll();
            cnt++;
        }
        System.out.println(
            String.format("A maximum of %d person%s will be able to buy bread.", cnt, cnt == 1 ? "" : "s")
        );
        sc.close();
    }
}
