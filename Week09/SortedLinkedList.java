import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedList {

    public static void main(String[] args) {

       

         sortLater();
         insertSort();
         System.out.println(System.currentTimeMillis());

    }

    static void insertSort() {

        var startTime = System.currentTimeMillis();

        LinkedList<Integer> list = new LinkedList<>();

        Random random = new Random();

        for(var i=0;i<20;i++){

            var temp= random.nextInt(50);

            var index = list.size() -1;
            while(index>=0 && temp < list.get(index)){
                    index--;
                

            }
            list.add(++index, temp);
           
        }

        var end= System.currentTimeMillis();
        System.out.println("Time for insertsort: " + (end- startTime));
        System.out.println(list);

        

    }

    static void sortLater() {
        var startTime = System.currentTimeMillis();

        LinkedList<Integer> list = new LinkedList<>();

        Random random = new Random();

        for (var i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }

       // System.out.println(list);
        Collections.sort(list);

        var endTime = System.currentTimeMillis();

        System.out.println("Time for sortLater: " + (endTime- startTime));
        System.out.println(list);

     
    }
}
