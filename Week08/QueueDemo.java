import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo  {
     public static void main(String[] args) {
  
        int NumberOfBread=14;
        int NumberOfPeople=0;
        Queue<Integer>  q = new LinkedList<>();
       // Number of breads, a person wants to buy from store
        q.add(2); 
        q.add(3);
        q.add(4);
        q.add(5);
  
        while(NumerOfBread > 0 && !q.isEmpty()){
            int BreadForEachPerson = q.peek();
            int BreadLeft=  (BreadForEachPerson < NumberOfBread) ? BreadForEachPerson : NumberOfBread;
            NumberOfBread -= BreadLeft;
            NumberOfPeople++;
            q.poll(); 
        }
        System.out.println(NumberOfPeople + " will be able to buy bread");
   
    }
}
