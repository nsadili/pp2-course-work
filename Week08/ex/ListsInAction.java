import java.util.ArrayList;
import java.util.Iterator;
public class ListsInAction {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>(); //myList is reference
        
        myList.add(9);
        myList.add(7);
        myList.add(3);
        myList.add(1);

        //method 1
        myList.remove(1); // it will remove 7 which places in index 1
        myList.remove(Integer.valueOf(1)); //it will remove 1
        System.out.println(myList.toString());

        System.out.println();

        //method 2
        for(int i=0;i<myList.size();i++){
            System.out.print(myList.get(i)+" ");
            System.out.println();
        }

        System.out.println();
        
        //method 3
        for(int el: myList){
            el+=10; // it will print 19,17,13,11 | but myList will not change
            System.out.print(el+" ");
            System.out.println();
        }

        System.out.println();

        //method 4

        Iterator<Integer> it = ((ArrayList<Integer>)myList).iterator();

        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }

    
}
