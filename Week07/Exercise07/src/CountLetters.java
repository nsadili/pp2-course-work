public class CountLetters {
    public static void main(String[] args) {
        String a = "Sdha djs!";
        printLetterCount(a);
    }

    public static void printLetterCount(String str) {
        int cnt[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            try {
                if (Character.isLetter(str.toLowerCase().charAt(i)))
                    cnt[str.toLowerCase().charAt(i) - 'a']++;
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }

        for (int i = 0; i < cnt.length; i++) {
            System.out.println((char)('a' + i) + ":" + cnt[i]);
        }
    }
}
