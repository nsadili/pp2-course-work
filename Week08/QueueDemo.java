import java.util.*;

public class QueueDemo  {
    public static void main(String[] args) {
 
       int breadInStore=100;
       Queue<Integer> queue= new LinkedList<>();
       queue.add(2);
       queue.add(3);
       queue.add(1);
       queue.add(4);
       int numPeople=0;
 

       while(!queue.isEmpty() && breadInStore>0){
           int breadPerPerson= queue.peek();
           int numBread= Math.min(breadPerPerson,breadInStore);
           breadInStore-= numBread;
           numPeople++;
           queue.poll();
        
       }
       System.out.println("How many persons will be able to buy bread: " + numPeople);
   }
}