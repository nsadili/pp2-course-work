import java.util.LinkedList;
import java.util.Scanner;


public class SortedLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        
        System.out.println("Enter integers (or enter q to quit):");
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equals("q")) {
                break;
            }
            try {
                int value = Integer.parseInt(input);
                int index = 0;
                while (index < list.size() && list.get(index) < value) {
                    index++;
                }
                list.add(index, value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + input);
            }
        }
        
        System.out.println("Sorted list: " + list);
    }
}

