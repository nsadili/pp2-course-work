import java.util.LinkedList;
import java.util.Queue;

public class BreadQueueDemo {
    public static void main(String[] args) {
        int[] breadperPerson = {2,1,3,4,2};
        int breadinStore = 7;

        System.out.println("Bread in store: "+ breadinStore);

        Queue<Integer> queue =  new LinkedList<>();

        for(int i=0; i<breadperPerson.length; i++){
            queue.add(breadperPerson[i]);
        }
        int ServedPerson=0;
        int TotalBreadSold=0;
//while(breadinStore>0 && queue.poll()== null){
        while(breadinStore>0 && !queue.isEmpty()){
            int breadRequest = queue.poll();
            if (breadRequest <= breadinStore){
                TotalBreadSold += breadRequest;
                breadinStore -= breadRequest;
                ServedPerson++;
            }
            else{
                System.out.println("Serving stopped");
                break;
            }
        }

        System.out.println("People served: "+ ServedPerson );
        System.out.println("Total breads sold: "+ TotalBreadSold);

    }
}
