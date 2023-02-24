class X {
public X() {
System.out.println("In constructor X.");
}
}
class Y extends X {
public Y() {
System.out.println("In constructor Y.");
}
}
public class Main {
public static void main(String[] args) {
Y y = new Y();
// First it prints "In the constructor X." then it prints "In constructor Y.". It is because X is super class, and do not have any static or instance initialization;Therefore it prints the constructor of X first, then prints the constructor of Y. 
}
}