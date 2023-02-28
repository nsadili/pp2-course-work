class PassExample {
    public int changeValue(int x) { // void
    return x = x + 2;
    }
    public static void main(String args[]) {
    PassExample pe = new PassExample();
    int a = 5;
    System.out.println("In the start a is :" + a);
    pe.changeValue(a);
    System.out.println("Now a is :" + a);
    System.out.println(pe.changeValue(a));
    }
    }
    