public class task5 {
    public static int countCustomers(int[] piecesPerPerson, int breadInStore) {
        int totalBread = breadInStore;
        int numCustomers = 0;
    
        for (int i = 0; i < piecesPerPerson.length; i++) {
            totalBread -= piecesPerPerson[i];
            if (totalBread < 0) {
                break;
            }
            numCustomers++;
        }
    
        return numCustomers;
    }
    
}
