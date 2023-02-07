class Wolf { 

    int teeth = 42;
    }
    
    public class MyApp1 {
    public static void main( String args[]) {

    Wolf rocky = new Wolf();
    Wolf masha = new Wolf();

    rocky.teeth = 40; // we set the tooth count for Rocky
    masha.teeth = 38; // we set the tooth count for Masha

    System.out.println("Rocky has "+rocky.teeth+" teeth. "); 
    System.out.println("Masha has "+masha.teeth+" teeth. ");
    
    } 
    }
    