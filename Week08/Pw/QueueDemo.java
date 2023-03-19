import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo  {
     public static void main(String[] args) {
  
        int breadInStore=10;
        Queue<Integer> queue= new LinkedList<>();
        queue.add(2);// the number of bread first person wants
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
