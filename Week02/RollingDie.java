import java.util.*;
public class RollingDie {public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Random rand = new Random();
    int r8 = rand.nextInt(8) + 1;
    int r4 = rand.nextInt(4) + 1;
    while (true) {
    if (r8==1) System.out.println(1);
    else if (r8==2) System.out.println(2);
    else if (r8==3) System.out.println(3);
    else if (r8==4) System.out.println(4);
    else if (r4 == 1) {System.out.print(5); break;}
    else if (r4 == 2) {System.out.print(6); break;}}
}
}