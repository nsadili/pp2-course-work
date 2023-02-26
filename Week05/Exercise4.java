package week05;

public class Exercise4 {
    /*
    * Output:
    *
    * AS
    * GTS
    * A
    * 5 AC
    * GT
    * GTC
    * */
    public static void main(String[] args) {
        GeneralType generalType = new GeneralType();
    }
}

class SuperType {
    static {
        System.out.println("AS");
    }

    {
        System.out.println("A");
    }

    public SuperType() {
        System.out.println("AC");
    }

    public SuperType(int x) {
        System.out.println(x + " AC");
    }
}

class GeneralType extends SuperType {
    static {
        System.out.println("GTS");
    }

    {
        System.out.println("GT");
    }

    public GeneralType() {
        super(5);
        System.out.println("GTC");
    }
}
