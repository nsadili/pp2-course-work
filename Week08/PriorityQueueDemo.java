package Week08;

import java.util.List;
import java.util.ArrayList;

public class PriorityQueueDemo {

    public static int calculateMaxNumOfPeopleWithBread(List<Integer> breadPerPerson, int breadInStore) {
        
        int maxNumPeopleWithBread = 0;
        int totalBreadRequired = 0;
        int numPeople = breadPerPerson.size();
        
        for (int i = 0; i < numPeople; i++) {
            int currentBreadRequired = breadPerPerson.get(i);
            if (totalBreadRequired + currentBreadRequired <= breadInStore) {
                totalBreadRequired += currentBreadRequired;
                maxNumPeopleWithBread++;
            } else {
                break;
            }
        }
        
        return maxNumPeopleWithBread;
    }
    
    public static void main(String[] args) {
        
        // example usage
        List<Integer> breadPerPerson = new ArrayList<Integer>();
        breadPerPerson.add(2);
        breadPerPerson.add(3);
        breadPerPerson.add(1);
        
        int breadInStore = 4;
        
        int maxNumPeopleWithBread = calculateMaxNumOfPeopleWithBread(breadPerPerson, breadInStore);
        
        System.out.println("Maximum number of people who can buy bread: " + maxNumPeopleWithBread);
    }

}