import java.util.*;
import java.lang.Math;
import java.util.Random;
public class RollingDie {
        public static void main(String args[]) {
            Random rand = new Random();
            while (true) {
                int rand4 = rand.nextInt(4) + 1;
                int rand8 = rand.nextInt(8) + 1;
                if (rand8 == 1) {
                    System.out.print(1);break;
                }
                else if (rand8 == 2) {
                    System.out.print(2);break;
                }
                else if (rand8 == 3) {
                    System.out.print(3);break;
                }
                else if (rand8 == 4) {
                    System.out.print(4);break;
                }
                else if (rand4 == 1) {
                    System.out.print(5);break;
                }
                else if (rand4 == 2) {
                    System.out.print(6);break;
                }
            }
        }

    }