public class OverrideDemo {
public static void main(String[] args) {
Child child = new Child();
System.out.println(child.calcValue(5));
System.out.println(child.calcValue(5, 10));
}
}
class Parent {
public int calcValue(int a) {
System.out.println("Super");
return a * 2;
}
}
class Child extends Parent {
public int calcValue(int a, int b) {
System.out.println("Subclass");
return (a + b) * 2;
}
}

// Although it is not visible, there is calcValue(int a) - constuctor in Child class (as we inherited it from Parent class).
//And, this is example of overloading. We have two same named class with different number of paramenters, and when we print it takes most fitted one.
//In the main class, we have child.calcValue(5) - "One input parameter" which is most fitted to constructor returning a * 2.
// In the second one , we have child.calcValue(5, 10) - "Two input parameters" which is most fitted to constructor returning (a + b) * 2;
//So , the output is 10 /n 30