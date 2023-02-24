package Week05.ex;

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

///////////
/*
 Description:

 Answers:
 AS
 A
 5 AC
 GT
 GTS
 GTC

 This code defines two classes: A and GeneralType.
 GeneralType extends A, which means that it inherits all of A's fields and methods. 
 When an instance of GeneralType is created, the constructor for A is called first, followed by the constructor for GeneralType.

 So in short,
 First the statics go that means AS and A 
 Then the super(5); part works
 Because of the fact that in super we specify the integer 5
 We use the publicA(int x) part which gives us
 (x + "AC")
 and it gives us 5 AC
 then the others we write how they come 
 */
