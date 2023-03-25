package Week08.Ex1;

import java.util.*;

public class IntegerListExample {
  public static void main(String[] args) {
    // create a new ArrayList of integers
    List<Integer> myIntList = new ArrayList<>();

    // add some elements to the list
    myIntList.add(10);
    myIntList.add(20);
    myIntList.add(30);

    // print the elements using the toString() method
    System.out.println("Using toString() method: " + myIntList.toString());

    // print the elements using a for statement
    System.out.print("Using for statement: ");
    for (int i = 0; i < myIntList.size(); i++) {
      System.out.print(myIntList.get(i) + " ");
    }
    System.out.println();

    // print the elements using an enhanced for statement
    System.out.print("Using enhanced for statement: ");
    for (int element : myIntList) {
      System.out.print(element + " ");
    }
    System.out.println();

    // print the elements using an iterator
    System.out.print("Using iterator: ");
    Iterator<Integer> iter = myIntList.iterator();
    while (iter.hasNext()) {
      System.out.print(iter.next() + " ");
    }
    System.out.println();
  }
}

