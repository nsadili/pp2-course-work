import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {
        Random ran = new Random();
        int roll = ran.nextInt(8) + 1;
        int value;
        switch (roll) {
            case 1:
            case 2:
            case 3:
            case 4:
                value = ran.nextInt(4) + 1;
                break;
            case 5:
            case 6:
                value = ran.nextInt(2) + 5;
                break;
            case 7:
            case 8:
            default:
                value = -1;
        }
        
        System.out.println(value);
    }
}
