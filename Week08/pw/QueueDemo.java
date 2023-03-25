package pw;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args){
        Queue<Integer> customerQueue = new LinkedList<>();
        Integer totalBread = 23;
        //for example customers will take 1 2 3 4 5 6 7 bread
        for(int i=1;i<8;i++){
            customerQueue.add(i);
        }
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
