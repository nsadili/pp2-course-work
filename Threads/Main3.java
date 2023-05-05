package Threads;

public class Main3 {
    public static void main(String[] args) {
        MyConsumer c1 = new MyConsumer("Ali");
        MyConsumer c2 = new MyConsumer("Rashad");
        MyConsumer c3 = new MyConsumer("Orkhan");
        MyProducer p = new MyProducer();
        p.start();
        c1.start();
        c2.start();
        c3.start();

    }

}
