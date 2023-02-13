public class RollingDie {

    public static void main(String[] args) {   

        var roll = Math.random();

        int result;
        
        if (roll < 1.0 / 8.0) {
            result = 1;
        } else if (roll < 2.0 / 8.0) {
            result = 2;
        } else if (roll < 3.0 / 8.0) {
            result = 3;
        } else if (roll < 4.0 / 8.0) {
            result = 4;
        } else if (roll < 6.0 / 8.0) {
            result = 5;
        } else {
            result = 6;
        }
        
        System.out.println("The roll of the loaded die is: " + result);
    }
}

