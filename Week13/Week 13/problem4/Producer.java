package problem4;

public class Producer extends Thread {
    private Shoemaker shoemaker;
    private Integer minMillis;
    private Integer maxMillis;
    public Producer(String name, Shoemaker shoemaker, Integer min, Integer max){
        super(name);
        this.shoemaker = shoemaker;
        minMillis = min;
        maxMillis = max;
    }

    public void run() {
        try {
            System.out.println("-> " +getName() + " started producing a shoe");
            Thread.sleep(Customer.randomMillis(minMillis, maxMillis)); // wait 3 seconds before starting to produce
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            shoemaker.produceShoe();
            System.out.println("-> " + getName() + " produced a shoe");
            try {
                Thread.sleep(Customer.randomMillis(minMillis, maxMillis)); // wait 2 seconds before producing another shoe
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}