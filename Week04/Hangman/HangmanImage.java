package Week04.Hangman;

public class HangmanImage {
    public static void HangmanImageCnt(int count, char[] mainword) {
        if (count == 9) {
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 8) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (count == 7) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |       ()");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 6) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |       ()");
            System.out.println("   |        | ");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 5) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |       ()");
            System.out.println("   |        | ");
            System.out.println("   |        |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 4) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |       ()");
            System.out.println("   |      / | ");
            System.out.println("   |        |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 3) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |       ()");
            System.out.println("   |      / | '\'");
            System.out.println("   |        |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 2) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |       ()");
            System.out.println("   |      / | '\'");
            System.out.println("   |        |");
            System.out.println("   |       /  ");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 1) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |       ()");
            System.out.println("   |      / | '\'");
            System.out.println("   |        |");
            System.out.println("   |       / '\'");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 0) {
            System.out.println("   ____________");
            System.out.println("   |        |  ");
            System.out.println("   |        |  ");
            System.out.println("   |       () ");
            System.out.println("   |      / | '\'");
            System.out.println("   |        |");
            System.out.println("   |       / '\'");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("GAME OVER! The word was " + mainword);
        }
    }
}
