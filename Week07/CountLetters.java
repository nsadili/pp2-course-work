
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

            for (int i = 0; i < word.length(); i++){
                try {
                    counts[word.charAt(i) - 'a']++;
                }
                catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println(word.charAt(i) + " is a non-alphabetic character");
                }
            }
                

            System.out.println("\tHere are the letters:");

            for (int i = 0; i < counts.length; i++)
                if (counts[i] != 0)
                    System.out.println((char) (i + 'a') + ": " + counts[i]);

        } while (true);

        scan.close();
    }
}