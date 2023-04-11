package Week08;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        int[] breadPerPerson = {5, 1, 4, 4, 2, 6, 8, 2};
        int breadInStore = 10;

        int numOfPeople = calculateNumOfPeople(breadPerPerson, breadInStore);

        System.out.println("Number of people: " + numOfPeople);
    }

    public static int calculateNumOfPeople(int[] breadPerPerson, int breadInStore) {
        int numOfPeople = 0;
        int i = 0;

        while (i < breadPerPerson.length && breadInStore >= breadPerPerson[i]) {
            breadInStore -= breadPerPerson[i];
            numOfPeople++;
            i++;
        }

        return numOfPeople;
    }
}
