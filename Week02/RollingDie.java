import java.lang.Math;

public class RollingDie {
    public static void main(String[] args){
        int roll = 0;
        double n = Math.random();
        if(n >= 0 && n < (1.0 / 8.0)) roll = 1;
        else if(n >= (1.0 / 8.0) && n < (2.0 / 8.0)) roll = 2;
        else if(n >= (2.0 / 8.0) && n < (3.0 / 8.0)) roll = 3;
        else if(n >= (3.0 / 8.0) && n < (4.0 / 8.0)) roll = 4;
        else if(n >= (4.0 / 8.0) && n < (6.0 / 8.0)) roll = 5;
        else if(n >= (6.0 / 8.0) && n < (1)) roll = 6;
        System.out.printf("%d", roll); 
    }
}


