package problem4;

public class Shop {
    public static void main(String[] args) {
        try {
            // testOneCustOneProd();
            testMultCustOneProd();
            // testOneCustMultProd();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void testOneCustOneProd() throws InterruptedException {
        System.out.println("--------- One Customer and One Producer ---------");
        
        Shoemaker shoemaker = new Shoemaker(5, 5);

        Producer producer = new Producer("Producer", shoemaker, 3000, 5000);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        
        Customer customer = new Customer("Customer", shoemaker, 2000, 4000);
        Thread customerThread = new Thread(customer);
        customerThread.start();

        producerThread.join();
        customerThread.join();
    }

    public static void testMultCustOneProd() throws InterruptedException {
        System.out.println("--------- Multiple Customers and One Producer ---------");

        Shoemaker shoemaker = new Shoemaker(10, 12);

        Producer producer = new Producer("Producer", shoemaker, 2000, 4000);
        Thread producerThread = new Thread(producer);
        producerThread.start();

        Customer customer1 = new Customer("Customer 1", shoemaker, 2000, 4000);
        Customer customer2 = new Customer("Customer 2", shoemaker, 2000, 4000);
        Thread customerThread1 = new Thread(customer1);
        Thread customerThread2 = new Thread(customer2);
        customerThread1.start();
        customerThread2.start();
        
        producerThread.join();
        customerThread1.join();
        customerThread2.join();
    }

    public static void testOneCustMultProd() throws InterruptedException {
        System.out.println("--------- One Customer and Multiple Producers ---------");
        
        Shoemaker shoemaker = new Shoemaker(13, 20);

        Producer producer1 = new Producer("Producer 1", shoemaker, 4000, 6000);
        Producer producer2 = new Producer("Producer 2", shoemaker, 3000, 5000);
        Thread producerThread1 = new Thread(producer1);
        Thread producerThread2 = new Thread(producer2);
        producerThread1.start();
        producerThread2.start();

        Customer customer = new Customer("Customer", shoemaker, 2000, 4000);
        Thread customerThread = new Thread(customer);
        customerThread.start();

        producerThread1.join();
        producerThread2.join();
        customerThread.join();
    }

}
