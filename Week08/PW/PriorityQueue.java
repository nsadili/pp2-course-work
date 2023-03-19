import java.util.Arrays;
public class PriorityQueue{
public static int[] buyBread(int[] breadPerPerson, int totalBread) {
    int[] result = new int[2];
    int numPeople = 0;
    int remainingBread = totalBread;

    for (int i = 0; i < breadPerPerson.length; i++) {
        if (breadPerPerson[i] <= remainingBread) {
            numPeople++;
            remainingBread -= breadPerPerson[i];
        } else {
            break;
        }
    }

    result[0] = numPeople;

    numPeople = 0;
    remainingBread = totalBread;

    Arrays.sort(breadPerPerson);

    for (int i = 0; i < breadPerPerson.length; i++) {
        if (breadPerPerson[i] <= remainingBread) {
            numPeople++;
            remainingBread -= breadPerPerson[i];
        } else {
            break;
        }
    }

    result[1] = numPeople;

    return result;
}

public static void main(String[] args) {
    int[] breadPerPerson = {2, 1, 3, 2};
    int totalBread = 6;

    int[] result = buyBread(breadPerPerson, totalBread);

    System.out.println("Number of people who can buy bread: " + result[0]);
    System.out.println("Maximum number of people who can buy bread: " + result[1]);
}

}