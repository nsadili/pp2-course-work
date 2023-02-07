class Wolf {

    int teeth = 32;
    Wolf () {
        int teeth = 42; int eyes = 2; String hairColor = "gray";  // why not 42 but 32 ???
    }
    }

public class MyApp4 {
    public static void main(String[] args) {
        
        Wolf flex = new Wolf();  
        System.out.println("Alex has "+flex.teeth+" teeth");  // ???

    }
}