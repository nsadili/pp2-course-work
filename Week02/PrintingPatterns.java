package Week02;

public class PrintingPatterns {
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if ((i + j) % 2 == 0)
                        System.out.print("*");
                    else
                        System.out.print("#");
                }
                System.out.println();
            }
        }
    }
