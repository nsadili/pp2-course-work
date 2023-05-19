package ProducerConsumerproblem;
class Producer implements Runnable {
    private ShoemakerShop shop;
    private int totalShoes;

    public Producer(ShoemakerShop shop, int totalShoes) {
        this.shop = shop;
        this.totalShoes = totalShoes;
    }

    @Override
    public void run() {
        for (int i = 1; i <= totalShoes; i++) {
            try {
                shop.produce(i);
                Thread.sleep(1000); // Simulating time taken to produce a shoe
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}