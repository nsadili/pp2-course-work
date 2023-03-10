package Week07.pw;

    import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// reading from standard input

        String line = scan.nextLine(), word = null;
        scan.close();

        scan = new Scanner(line); 
        int sum = 0, count = 0;
        while (scan.hasNext()) { 
            word = scan.next();
            if (isNumeric(word)) {
                sum += Integer.parseInt(word);
                count++;
            }
        }

        scan.close();

        if (count == 0)
            System.out.println("There are no VALID input provided!");
        else
            System.out.printf("Sum = %d\nCount = %d\nAverage = %.3f\n", sum, count, (float) sum / count);
    }

    
    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

