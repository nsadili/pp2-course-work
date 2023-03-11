package Week04.Hangman;

public class HangmanImage {
    public static void HangmanImageCnt(int count, String WordString) {
        if (count == 8) {
            System.out.println("      +---+\n      |\n      |\n      |\n      |\n      |\n      =========");
        }
        if (count == 7) {
            System.out.println("      +---+\n      |   |\n      |\n      |\n      |\n      |\n      =========");
        }
        if (count == 6) {
            System.out.println("      +---+\n      |   |\n      |   O\n      |\n      |\n      |\n      =========");
        }
        if (count == 5) {
            System.out.println("      +---+\n      |   |\n      |   O\n      |   |\n      |\n      |\n      =========");
        }
        if (count == 4) {
            System.out.println("      +---+\n      |   |\n      |   O\n      |  /|\n      |\n      |\n      =========");
        }
        if (count == 3) {
            System.out.println("      +---+\n      |   |\n      |   O\n      |  /|\\\n      |\n      |\n      =========");
        }
        if (count == 2) {
            System.out.println("      +---+\n      |   |\n      |   O\n      |  /|\\\n      |   |\n      |\n      =========");
        }
        if (count == 1) {
            System.out.println("      +---+\n      |   |\n      |   O\n      |  /|\\\n      |   |\n      |  /\n      =========");
        }
        if (count == 0) {
            System.out.println("      +---+\n      |   |\n      |   O\n      |  /|\\\n      |   |\n      |  / \\\n      =========");
            System.out.println("GAME OVER! The word was " + WordString);
        }
    }

    public void showImage(int heart) {
    }
}
