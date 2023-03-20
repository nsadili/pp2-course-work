import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListOfInteger {
    public static void main(String[] args) {
     
        List<Integer> intList = new ArrayList<>();

        intList.add(5);
        intList.add(-11);
        intList.add(6);

        //print by using toString method
        System.out.println(intList.toString());

        //print by using for loop
        for(int i = 0; i < intList.size(); i++){
            System.out.print(intList.get(i) + " ");
        }

        System.out.println();

        //print by using enhanced for loop
        for(Integer o: intList){
            System.out.print(o + " ");
        }

        System.out.println();

        //print by using iterator
        Iterator<Integer> iter = intList.iterator();

        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }

        //remove
        intList.remove((Integer) 5);
        
    }
}
