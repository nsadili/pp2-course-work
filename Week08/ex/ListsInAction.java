import java.util.ArrayList;
import java.util.Iterator;

public class ListsInAction {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>();

        myList.add(9);
        myList.add(7);
        myList.add(3);
        myList.add(1);

        //System.out.println(myList.toString());

        //for(int c=0; c<myList.size();c++)
        //System.out.println(myList.get(c) +" ");
       // System.out.println();

          // for(int el : myList){
         //el=10+el;
         // System.out.println(el+" ");
         //  }
         //System.out.println();
          //System.out.println(myList);


Iterator<Integer> it =((ArrayList<Integer>)myList).iterator();
while(it.hasNext()){
    System.out.print(it.next()+ " ");
}
System.out.println();
    }
}