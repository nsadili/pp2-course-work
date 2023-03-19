import java.util.*;

public class Sorttheelementsofthelist {

    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 4));
        

        Collections.sort(numbers);
        System.out.println("Sorted using Collections.sort(): " + numbers);
        
   
        numbers.sort(null);
        System.out.println("Sorted using List.sort(): " + numbers);
        
  
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        };
        Collections.sort(numbers, comparator);
        System.out.println("Sorted using Comparator (anonymous class): " + numbers);
        
      
        MyComparator myComparator = new MyComparator();
        numbers.sort(myComparator);
        System.out.println("Sorted using Comparator (concrete class): " + numbers);
        
    }
    
    static class MyComparator implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return a - b;
        }
    }

}
