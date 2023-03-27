import java.util.Arrays;

public class PriorityQueueDemo {
    public static int calculateMaxNumberOfCustomers(int[] breadPerPerson, int breadInStore) {
        Arrays.sort(breadPerPerson);
        int numCustomers = 0;
        int i = 0;
        while (i < breadPerPerson.length && breadInStore >= breadPerPerson[i]) {
            breadInStore -= breadPerPerson[i];
            numCustomers++;
            i++;
        }
        return numCustomers;
    }

    public static void main(String[] args) {
        int[] breadPerPerson = { 2, 3, 1, 4 };
        int breadInStore = 10;
        int maxNumCustomers = calculateMaxNumberOfCustomers(breadPerPerson, breadInStore);
        System.out.println(maxNumCustomers + " customers can buy bread.");
    }
}
