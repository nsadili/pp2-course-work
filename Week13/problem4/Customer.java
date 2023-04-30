package problem4;
import java.util.Random;

public class Customer extends Thread {
    private Shoemaker shoemaker;
    private Integer minMillis;
    private Integer maxMillis;
    public Customer(String name, Shoemaker shoemaker, Integer min, Integer max) {
        super(name);
        this.shoemaker = shoemaker;
        minMillis = min;
        maxMillis = max;
    }
    
    public void run() {
        try {
            System.out.println("-> " + getName() + " entered the shop");
            Thread.sleep(randomMillis(minMillis, maxMillis)); // wait random seconds before starting to buy shoes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            shoemaker.sellShoe();
            System.out.println("-> " + getName() + " bought a shoe");
            try {
                Thread.sleep(randomMillis(minMillis, maxMillis)); // wait random seconds before buying another shoe
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static int randomMillis(Integer min, Integer max){
        Random random = new Random();
        int randomMillis = random.nextInt(max - min + 1) + min;
        return randomMillis;
    }
}
