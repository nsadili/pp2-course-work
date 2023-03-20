class A {
    static { System.out.println("AS"); }
    { System.out.println("A"); }
    public A() { System.out.println("AC"); }
    public A(int x) { System.out.println(x + " AC"); }
}
    class GeneralType extends A {
    static { System.out.println("GTS"); }
    { System.out.println("GT"); }
    public GeneralType() {
    super(5);
    System.out.println("GTC");
    }
}
public class ExFour {
    public static void main(String[] args){
        A a = new A();
        GeneralType gt = new GeneralType();
    }
}