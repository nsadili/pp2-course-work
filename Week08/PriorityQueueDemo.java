import java.util.*

public class PriorityQueueDemo  {
     public static void main(String[] args) {
        int BreadWanted = 0;
        int NumberOfBread=14;
        int NumberOfPeople=0;
        Queue<Integer>  q = new LinkedList<>();
       // Number of breads, a person wants to buy from store
        q.add(2); 
        q.add(3);
        q.add(4);
        q.add(5);
       
      for(int BreadForEachPerson : q){
      BreadWanted += BreadForEachPerson;
      }
  
        while(NumerOfBread > 0 && !q.isEmpty()){
            int BreadForEachPerson = q.peek();
            int BreadLeft=  (BreadForEachPerson < NumberOfBread) ? BreadForEachPerson : NumberOfBread;
            BreadWanted -= BreadLeft;
            NumberOfBread -= BreadLeft;
            if(BreadWanted < 0){
            NumberOfPeople++;
            break;
        }
        NumberOfPeople ++;
        q.poll()
     }
        System.out.println(NumberOfPeople + "  are maximum numeber of people");
   
    }
}
