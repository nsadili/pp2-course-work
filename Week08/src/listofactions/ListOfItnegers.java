package listofactions;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

    public class ListOfItnegers {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //1)
        // System.out.println(list.toString());

        //2)
        // System.out.print("[");
        // for(int i=0; i<list.size(); i++) {
        //     System.out.print(list.get(i));
        //     if(i != list.size() - 1){
        //         System.out.print(", ");
        //     } else{
        //         System.out.print("]");
        //     }
        // }

        //3)
        // System.out.print("[");
        // for(Integer i: list) {
        //     System.out.print(i);
        //     if(i != list.get(list.size() - 1)){
        //         System.out.print(", ");
        //     } else{
        //         System.out.print("]");
        //     }
        // }

        //4)
        // Iterator<Integer> it = list.iterator();
        // System.out.print("[");
        // while(it.hasNext()) {
        //     Integer num = it.next();
        //     System.out.print(num+", ");
        // }
        // System.out.print("]");
    }
}
