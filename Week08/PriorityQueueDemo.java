import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int breadInStore=100;
        int numberOfPeople=0;
        int requiredBread=0;
        
        Queue<Integer> queue= new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(4);
       

        for(int breadPerPerson: queue){
            requiredBread+= breadPerPerson;
        }

        while(!queue.isEmpty()&& breadInStore>0){
            int breadPerPerson= queue.peek();
            int numBread= Math.min(breadPerPerson,breadInStore);
            breadInStore-=numBread;
            requiredBread-=numBread;
            if(requiredBread<=0){
                numberOfPeople++;
                break;
            }
            numberOfPeople++;
            queue.poll();
        }

        System.out.println("Maximum number of people: "+numberOfPeople);

     
}
}