
class Wolf { 

    int teeth = 42;
    }
    
public class MyApp2 {
    public static void main(String[] args) {

    Wolf alex = new Wolf();
    Wolf fred = alex;

    System.out.println("Alex has "+alex.teeth+" teeth "); // 42
    System.out.println("Fred has "+fred.teeth+" teeth "); // 42

    alex.teeth = 35;

    System.out.println("Alex has "+alex.teeth+" teeth "); // 35
    System.out.println("Fred has "+fred.teeth+" teeth "); // 35

    }
}