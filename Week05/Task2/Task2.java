class A {
static
 {
 System.out.println("In static init block of A"); 
}

public A(){ 
System.out.println("In constructor A."); 
}

{
 System.out.println("In instance init block of A"); }
}

class B extends A {

static {
 System.out.println("In static init block of B"); 
}

public B() 

{ 
System.out.println("In constructor B."); 
}

{
 System.out.println("In instance init block of B"); }
}

public class Main2 {
public static void main(String[] args) {
B b = new B();
}
}

//Firstly, it prints static block of class A because it is super class, and static block is firstly executed.
//Then, static block of B is executed
// Afterward, it returns to A superclass and tries to finalize it exacuting initialization block and constructor respectively.
//At the end, it returns to B subclass and executes initizalization block and constructor respectively. 
//So the order is this:
// In static init block of A
//In static init block of B
//In instance init block of A
//In constructor A.
//In instance init block of B
//In constructor B.