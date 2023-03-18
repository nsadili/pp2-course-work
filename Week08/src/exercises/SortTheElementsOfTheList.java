package exercises;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class SortTheElementsOfTheList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(5);

		Collections.sort(list);
		System.out.println("Sorted using Collections.sort: " + list);

		List<String> stringList = new ArrayList<>();

		stringList.add("apple");
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("pear");

		stringList.sort(null);
		System.out.println("Sorted using List.sort: " + stringList);
		
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; 
            }
        });
        System.out.println("Sorted using anonymous class: " + list);

        class ReverseComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; 
            }
        }
        Collections.sort(list, new ReverseComparator());
        System.out.println("Sorted using concrete class: " + list);
	}
}
