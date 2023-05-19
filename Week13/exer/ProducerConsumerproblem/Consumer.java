package ProducerConsumerproblem;
class Consumer implements Runnable {
    private ShoemakerShop shop;

    public Consumer(ShoemakerShop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int shoeId = shop.consume();
                Thread.sleep(2000); // Simulating time taken to buy a shoe
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}