package lecture_notes.note_0;

class RunClass implements Runnable {
    public void run() {
        System.out.println("Child thread - Hello");
    }
}

class ThreadClass extends Thread {
    public void run() {
        System.out.println("Child thread - World");
    }
}

public class ThreadDemo1 {
    public static void main(String args[]) {
        Thread t1 = new Thread(new RunClass());
        Thread t2 = new ThreadClass();
        t1.start();
        t2.start();
    }
}
