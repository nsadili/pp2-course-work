package Week05.ex;

public class Ex2 {
    class A {
        static { System.out.println("In static init block of A"); }
        public A() { System.out.println("In constructor A."); }
        { System.out.println("In instance init block of A"); }
       }
       class B extends A {
        static { System.out.println("In static init block of B"); }
        public B() { System.out.println("In constructor B."); }
        { System.out.println("In instance init block of B"); }
       }
       public class Main2 {
        public static void main(String[] args) {
        B b = new B();
        }
       }
}

////////////////
/*
 Description:

 Answer:
 In static init block of A
 In static init block of B
 In instance init block of A
 In constructor A.
 In instance init block of B
 In constructor B.

 First we start with the static and as we see the statics go first
 Then the instance of block of A and its constructor
 Then the instance of block of B and its constructor
 We must not forget that the constructors go first

 So why it happens ?
 This is because the main method of the Main2 class 
 Creates an instance of the B class using the new keyword.
 When the B class is loaded into memory, 
 the static initializer blocks of both A and B classes are executed in the order they appear in the code. 
 Thats why, "In static init block of A" is printed first, followed by "In static init block of B".

 In short, because the first one is block of A and then comes the blockof B
 We use first the constructor of A and then we also use at the end the constructor of B
 */