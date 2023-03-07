class PassExample {
    public void changeValue(int x) {
    x = x + 2;
    }
    public static void main(String args[]) {
    PassExample pe = new PassExample();
    int a = 5;
    System.out.println("In the start a is :" + a);
    pe.changeValue(a);
    System.out.println("Now a is :" + a);
    }
    }