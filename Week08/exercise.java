package Week08;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exercise{
    public static void main(String[] args) {
 exercise myList= new ArrayList<>(); 

//ArrayList<Integer> myList = new ArrayList<>();


myList.add(9);
myList.add(7);
myList.add(3);
myList.add(1);

myList.remove(1);
System.out.println(myList.toString());

//myList.add("my name");
 /*
 for(int cnt=0; cnt<myList.size(); cnt++ )
    System.out.print(myList.get(cnt) + " ");
    System.out.println();
*/
/* 
for(int el : myList){
    el = 10+ el;
    //acc.setBalance(100);
    System.out.println(el+ " ");
}

System.out.println();
*/
Itarator<Integer> it =((ArrayList<Integer>)myList.iterator()) ;
while (it.hasNext()){
    System.out.println(it.next() + " ");
    //remove the element if it is > 7
}
System.out.println();
}

    private void remove(int i) {
    }

    private void add(int i) {
    }

}