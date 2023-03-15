import java.util.ArrayList;
import java.util.Iterator;

public class Exercise_1_c_iii_iv_v {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        
        myList.add("coffee");
        myList.add("tea");
        myList.add("butter");
        myList.add("eggs");
        
        myList.remove(2);
        
        //usage of toString() method
        System.out.println(myList.toString());

        //usage of for statement
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        //usage of enhanced for statement
        for (String num : myList) {
            System.out.print(num + " ");
        }

        //iterator
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}

