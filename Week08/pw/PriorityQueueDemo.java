package pw;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue<Integer> customerQueue = new PriorityQueue<Integer>();

        Integer totalBread = 23;
        customerQueue.add(2);
        customerQueue.add(1);
        customerQueue.add(6);
        customerQueue.add(7);
        customerQueue.add(1);
        customerQueue.add(9);
        System.out.println(customerQueue);

        Integer count = 0;
        while(customerQueue.peek() != null && totalBread >= customerQueue.peek()){
            System.out.println(customerQueue);
            totalBread -= customerQueue.peek();
            customerQueue.remove();
            count += 1;
        }
        System.out.println("Bread Remained:" + totalBread.toString());
        System.out.print("queue stayed: ");
        System.out.println(customerQueue);
    }
}
