class GeneralType extends A {
    static { System.out.println("GTS"); }
    { System.out.println("GT"); }
    public GeneralType() {
    super(5);
    System.out.println("GTC");
    }
    }