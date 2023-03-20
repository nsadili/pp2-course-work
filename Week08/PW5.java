import java.util.LinkedList;
import java.util.Queue;

public class PW5 {
    public static int numbeOfPeople(int[] breadForEach, int breadInStore){
        int countPeople = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int bread: breadForEach){
            queue.add(bread);
        }
        while (!queue.isEmpty() && breadInStore >= queue.peek()){
            int bread = queue.poll();
            breadInStore -= bread;
            countPeople++;
        }
        return countPeople;
    }
    public static void main(String[] args) {
        int[] breadForEach = {2, 4, 1, 7, 9};
        int breadInStore = 13;
        System.out.println(numbeOfPeople(breadForEach, breadInStore)+ " people will be able to buy bread.");
    }
}
