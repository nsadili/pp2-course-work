package Week09;

import java.util.LinkedList;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
    
        int n=0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int index=0;
            n=sc.nextInt();

            if(ll.isEmpty()) ll.add(n);

            else if (n<ll.getFirst()) ll.addFirst(n);
            else if (n>ll.getLast()) ll.addLast(n);

            else {
                for (int x : ll){
                    if (n>=x) index++;
                    else {
                        ll.add(index, n);
                        break;
                    }
                }
            }
        }

        System.out.println(ll);
        // System.out.println("Done");

        
    }
}
