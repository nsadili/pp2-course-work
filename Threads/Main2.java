package Threads;

public class Main2 extends Thread {
    int amount = 0;

    public Main2(String string) {
        this.amount = Integer.parseInt(string);
    }

    public static void main(String[] args) {
        Main2 o1 = new Main2("1");
        o1.start();

        Main2 o2 = new Main2("2");
        o2.start();

        Main2 o3 = new Main2("3");
        o3.start();

        Main2 o4 = new Main2("4");
        o4.start();

        Main2 o5 = new Main2("5");
        o5.start();
    }

    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(amount);
        }
    }
}
