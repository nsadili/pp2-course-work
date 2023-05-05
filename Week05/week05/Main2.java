
class A {
    static {
        System.out.println("In static init block of A");
    }

    public A() {
        System.out.println("In constructor A.");
    }

    {
        System.out.println("In instance init block of A");
    }
}

class B extends A {
    static {
        System.out.println("In static init block of B");
    }

    public B() {
        System.out.println("In constructor B.");
    }

    {
        System.out.println("In instance init block of B");
    }

}

class C extends B {
    static {
        System.out.println("In static init block of C");
    }

    public C() {
        System.out.println("In constructor C.");
    }

    {
        System.out.println("In instance init block of C");
    }

    public static void main(String[] args) {
    }
}
