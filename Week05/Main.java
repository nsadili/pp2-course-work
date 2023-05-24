class X {
    public X() {
        System.out.println("In constructor X.");
    }
}

class Y extends X {
    public Y() {
        System.out.println("In constructor Y.");
    }
}

public class Main {
    public static void main(String[] args) {
        Y y = new Y();
    }
}
//When we run this program, it will output the following to the console:
In constructor X.
In constructor Y.
//This is because the Main class creates a new Y object, which is a subclass of X. When we create a new Y object, its constructor is called first. The Y constructor then calls the constructor of its superclass X, which prints out "In constructor X." to the console. After the X constructor completes, the Y constructor continues executing and prints out "In constructor Y." to the console. Therefore, the output shows both constructor messages printed in order.

