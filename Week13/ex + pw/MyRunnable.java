public class MyRunnable implements Runnable {

    public void run() {
        // operations --->>>
    }

    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread thr = new Thread(mr);

        Thread th = new Thread(new MyRunnable());
        thr.getPriority();
        th.setPriority(5);

        System.out.println(thr.getPriority());
    }
}