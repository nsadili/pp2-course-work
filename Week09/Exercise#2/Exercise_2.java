import java.util.Collections; //this import helps us providing classes to work with collections 
import java.util.LinkedList; //this import helps us providing specific interface used to demonstrate an ordered collection of elements
import java.util.Random; //this import helps to provide us with methods for generating pseudorandom numbers

//writing main class by writing the name same to the name of the file (Exercsie_2.java)
public class Exercise_2 {

    /*
    Let's start with the first method - adding elements in the sorted order.
    1. We create an empty list named "list1" and a Random object called "random" 
    2. Then we create a loop explaining how computer must generate number for us. We make it repeat the loop 10 times, so 
    everytime computer will pick one integer form the duration from 0 to 49 storing acquired values in list1.
     */
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int element = random.nextInt(50);
            int j = 0;
            for (Integer e : list1) {
                if (element < e) {
                    list1.add(j, element);
                    break;
                }
                j++;
            }
            if (j == list1.size()) {
                list1.addLast(element);
            }
        }
        System.out.println("Method 1: ");
        System.out.println(list1);

        /*
        Now let's move to method 2: adding elements randomly and then sorting the list
        1. We initialize an empty list named "list 2" and write the same loop as it was in method 2
        2. Then we finalize our code with Collections.sort, so our list will be sorted in an apporpriate way.
         */

        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int element = random.nextInt(50);
            list2.add(element);
        }
        Collections.sort(list2);
        System.out.println("Method 2: ");
        System.out.println(list2);
    }
}

/*
It's very difficult to distinguish, but the method one is better than the second, even if the second is 2 times smaller. The reason to it
is that using the first method computer creates list and adds valued already knwoing that they must be sorted, while using method 2 it will
take more time for it firstly to create a list of numbers, and then change it to an appropriate way. 
 */