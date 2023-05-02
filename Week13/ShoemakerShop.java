public class ShoemakerShop {
    public static void main(String[] args) {
        Shop shop = new Shop(5);
        new Thread(new Producer(shop)).start();
        new Thread(new Consumer(shop)).start();
        new Thread(new Consumer(shop)).start();

    }
}
