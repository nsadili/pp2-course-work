package Threads;

public class MyConsumer extends Thread {
    private String name;

    public MyConsumer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            int index = Base.list.size() - 1;
            System.out.println("Waiting");
            if (index >= 0) {
                String s = Base.list.remove(index);
                System.out.println(name + " = " + s);
            }
        }
    }

}
