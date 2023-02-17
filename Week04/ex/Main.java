public class Main {

    public static void main(String[] args) {                   // Z -> 0     A -> 90

char ch = 'Z'; // ascii code of 'Z' is 90

A a1 = new A(ch);

System.out.println(a1.label + " -> " + a1.number);

A a2 = new A((int) ch);

System.out.println(a2.label + " -> " + a2.number);

}

}
