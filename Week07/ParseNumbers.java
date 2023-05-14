package Week07;



import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine(), word = null;
        scan.close();

        scan = new Scanner(line);
        int sum = 0, count = 0;
        while (scan.hasNext()) { 
            word = scan.next();
            try{
            sum += Integer.parseInt(word); 
            count++;
            } catch(NumberFormatException e){
                
            }
           
        }

        scan.close();

        if (count == 0)
            System.out.println("There are no VALID input provided!");
        else
            System.out.printf("Sum = %d\nCount = %d\nAverage = %.3f\n", sum, count, (float) sum / count);
    }
}

