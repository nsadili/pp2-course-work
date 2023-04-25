public class ThreadClass extends Thread {

    public void run() { // sequential order
        // operation -->>
    }

    public static void main(String[] args) {

        ThreadClass thc = new ThreadClass();
        thc.start();  // multitasking || paralellism && calls run() method as well
    }
}
