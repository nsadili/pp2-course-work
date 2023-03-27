import java.util.*;

public class ListSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        Collections.sort(numbers);
        System.out.println("Sorted list using Collections.sort(): " + numbers);

        numbers.sort(null);
        System.out.println("Sorted list using List.sort(): " + numbers);

        Comparator<Integer> anonymousComparator = new Comparator<Integer>() {
            
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo(num2);
            }
        };
        numbers.sort(anonymousComparator);
        System.out.println("Sorted list using anonymous Comparator: " + numbers);

        MyComparator myComparator = new MyComparator();
        numbers.sort(myComparator);
        System.out.println("Sorted list using MyComparator: " + numbers);
    }

    static class MyComparator implements Comparator<Integer> {
       
        public int compare(Integer num1, Integer num2) {
            return num1.compareTo(num2);
        }
    }
}

