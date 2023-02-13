import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 4;
        for( int i = 1; i < n; i++) {
            for( int j = 1; j <= n; j++) {
                if( (i + j) % 2 == 0 ) {
                    System.out.print("* ");
                  } else {
                    System.out.print("# ");
                  }
                }
                System.out.println();
          
            }

        }
}