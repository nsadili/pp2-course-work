package Week08;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 1, 3, 2}; 
        int breadInStore = 8; 

        int totalBreadNeeded = 0;
        for (int i = 0; i < breadPerPerson.length; i++) {
            totalBreadNeeded += breadPerPerson[i];
        }

        if (totalBreadNeeded <= breadInStore) {
            System.out.println("all ican buy");
        } else {
            int numPeopleCanBuy = breadInStore / breadPerPerson[0];
            System.out.println(numPeopleCanBuy + " people in queue can buy ");
        }
    }
}
