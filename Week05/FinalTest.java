public class FinalTest {
    public static void main(String[] args) {
        GeneralType gen=new GeneralType();
    }
}

class A {
    static { System.out.println("AS"); }
    { System.out.println("A");} 
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