import java.util.Random;

public class RollingDie {
    public static void main(String[] args){
        Random dice= new Random();
        var n= dice.nextInt(8);
        if(n<=6){System.out.println(n);}
        else if(n==7) {System.out.println(5);}
        else if(n==8) {System.out.println(6);}
    }
    
}
