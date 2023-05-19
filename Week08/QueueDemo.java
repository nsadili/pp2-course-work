public class QueueDemo {
    public static int countPeopleCanBuyBread(int[] breadPerPerson, int breadInStore) {
        int totalPeople = breadPerPerson.length;
        int peopleCanBuy = 0;

        for (int i = 0; i < totalPeople; i++) {
            if (breadInStore >= breadPerPerson[i]) {
                breadInStore -= breadPerPerson[i];
                peopleCanBuy++;
            } else {
                break;
            }
        }

        return peopleCanBuy;
    }

    public static void main(String[] args) {
        // Example usage
        int[] breadPerPerson = {2, 1, 3, 2, 1};
        int breadInStore = 7;

        int peopleCanBuy = countPeopleCanBuyBread(breadPerPerson, breadInStore);
        System.out.println("Number of people who can buy bread: " + peopleCanBuy);
    }
}
