import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// reading from standard input

        String line = scan.nextLine(), word = null;
        scan.close();

        scan = new Scanner(line); // reading from a String
        int sum = 0, count = 0;
        while (scan.hasNext()) { // while there is a token to be read from the string
            word = scan.next();
            try{
            sum += Integer.parseInt(word); // read it and parse into Integer
            count++;
            }catch (NumberFormatException e){
                
            }
        
    }

        scan.close();

        

        if (count == 0){
            sum = 0;
            count = 0;
            System.out.printf("Sum = %d\nCount = %d\nAverage = 0\n", sum, count, (float) sum / count);
        }
            
        else
            System.out.printf("Sum = %d\nCount = %d\nAverage = %.3f\n", sum, count, (float) sum / count);
    }
}