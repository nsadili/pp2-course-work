class LocalClassTester {

    public void operate(int val) {

    Runnable factorialThread = new Runnable() {

    public void run() {
    int fact = 1;
    for (int i = 1; i <= val; i++)
    fact *= i;
    System.out.println("Result : "+fact);
    }

    };

    Thread t = new Thread(factorialThread);

    t.start(); 

    // Continue to do the other stuff….
    
    }

    public static void main(String [] args) {
    LocalClassTester lct = new LocalClassTester();
    lct.operate(5);
    }

    }
    