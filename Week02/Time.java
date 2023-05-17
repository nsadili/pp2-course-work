package Week02;

import java.util.Scanner;

class Time {
    public static void main(String[] args) {
    
        try (Scanner scan = new Scanner(System.in)) {
            var seconds = scan.nextInt();
            var hour = seconds / 3600;
            var min=seconds % 3600 /60;
            var sec= seconds - hour * 3600 - min * 60;

            System.out.printf("%02d hours, %02d minutes, %02d seconds",hour,min,sec);
        }
        
    }
 }
