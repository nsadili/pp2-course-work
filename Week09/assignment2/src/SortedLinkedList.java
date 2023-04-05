import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> sortedList = new LinkedList<>();
        Random random = new Random();
        long startTime, endTime, elapsedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            int randomNumber = random.nextInt(100000);
            if (sortedList.isEmpty() || sortedList.getLast() <= randomNumber) {
                sortedList.add(randomNumber);
            } else {
                for (int j = 0; j < sortedList.size(); j++) {
                    if (sortedList.get(j) >= randomNumber) {
                        sortedList.add(j, randomNumber);
                        break;
                    }
                }
            }
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Time consumed for adding elements in sorted order: " + elapsedTime + " ns");
        System.out.println("Sorted List: " + sortedList);

        sortedList.clear();
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sortedList.add(random.nextInt(100000));
        }
        sortedList.sort(null);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Time consumed for adding all elements and sorting later: " + elapsedTime + " ns");
        System.out.println("Sorted List: " + sortedList);
    }
}
