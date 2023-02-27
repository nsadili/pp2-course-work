class A {
    static {
        System.out.println("AS");
    }

    {
        System.out.println("A");
    }

    public A(){
        System.out.println("AC");
    }

    public A(int x) {
        System.out.println(x + " AC");
    }
}
