import java.util.Scanner;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Histogram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberofgrades = scanner.nextInt();
        int [] grades = new int[numberofgrades];
        
        for(int i = 0; i < numberofgrades; i++){
            grades[i] = scanner.nextInt();
        }

        

    }
}

public double Mean(int[] grades){
    int sum;
    for (int i = 0; i <grades.length;i++){
        sum += grades[i];
    }
    return sum/grades.length;
}

public double Median(int[] grades){
    Arrays.sort(grades);
    int middle = grades.length / 2;
    return grades[middle];
}

public double Mode(int[] grades){
    int mode;
    int count;
    for (int i = 0; i <grades.length;i++){
        
    }
}