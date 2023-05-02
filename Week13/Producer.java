public class Producer implements Runnable {
    private final Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                shop.produce("Shoe " + (++i));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}