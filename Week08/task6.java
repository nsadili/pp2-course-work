import java.util.Arrays;

public class task6 {
    public static int maxCustomers(int[] piecesPerPerson, int breadInStore) {
        Arrays.sort(piecesPerPerson);
        int maxCustomers = 0;
    
        while (piecesPerPerson.length > maxCustomers) {
            int totalBread = breadInStore;
            int numCustomers = 0;
    
            for (int i = 0; i < piecesPerPerson.length; i++) {
                totalBread -= piecesPerPerson[i];
                if (totalBread < 0) {
                    break;
                }
                numCustomers++;
            }
    
            if (numCustomers > maxCustomers) {
                maxCustomers = numCustomers;
            }
    
            piecesPerPerson = Arrays.copyOfRange(piecesPerPerson, 1, piecesPerPerson.length);
        }
    
        return maxCustomers;
    }
    
}
