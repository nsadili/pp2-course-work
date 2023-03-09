import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] counts = null;
        String word;

        do {
            counts = new int[26];
            System.out.print("Enter a word, preferrably only english letters (0 to exit): ");
            word = scan.nextLine();

            word = word.toLowerCase();

            if (word.trim().equals("0"))
                break;

            //try-catch
            try{
            for (int i = 0; i < word.length(); i++)
                counts[word.charAt(i) - 'a']++;

            String s = null;    // ---> it is NullPointerException and therefore will throw it. 
            s.toLowerCase();

            }catch(ArrayIndexOutOfBoundsException e){ // system cannot catch the exception and thus runtime will be terminated
                System.out.printf("<%s> is invalid word\n", word);
                continue;
            }
            catch(NullPointerException n){ //but this one can catch the exception
                System.out.println("NULL STRING!\n"); //if we don't write anything here, system will not care this exception
            }
            //
            
            System.out.println("\tHere are the letters:");

            for (int i = 0; i < counts.length; i++)
                if (counts[i] != 0)
                    System.out.println((char) (i + 'a') + ": " + counts[i]);

        } while (true);

        scan.close();
    }
}