package Week05;

public class Ex4 {
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
}

/* The output of the code would be AS
GTS
A
5 AC
GT
GTC
*/  

/*This is because the A class has a static initialization block that runs when the class is loaded, which prints "AS" to the console. 
Similarly, the GeneralType class has a static initialization block that runs when the class is loaded, which prints "GTS" to the console. 
These static blocks are executed before any instance of the classes are created */
