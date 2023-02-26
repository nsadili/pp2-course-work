package week05;

public class Exercise2 {

    /*
     * Output:
     *
     * In static init block of A
     * In static init block of B
     * In instance init block of A
     * In constructor A.
     * In instance init block of B
     * In constructor B.
     *
     * Since B extends A, both the static and instance initialization blocks of A are executed first, followed by those of B.
     */
    public static void main(String[] args) {
        B b = new B();
    }
}

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