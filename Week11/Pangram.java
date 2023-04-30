package Week11;

import java.util.*;

public class Pangram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        System.out.println("Enter first coordinate of a point");
        int point1 = scanner.nextInt();

        System.out.println("Enter second coordinate of a point");
        int point2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter an input word or sentence to check whether it is pangram");
        String inputString = scanner.nextLine();

        System.out.println("Enter firstname");
        String firstname = scanner.next();
        System.out.println("Enter lastname");
        String lastname = scanner.next();
        System.out.println("Enter age");
        int age = scanner.nextInt();


        SpecificProperty.IsItOdd isOdd = t -> {
            if (t % 2 == 0) {
                return 1;
            }
            return 0;
        };

        SpecificProperty.CheckingPoint isInFirst = (a, b) -> {
            if (a > 0 && b > 0) {
                return 1;
            }
            return 0;
        };

        SpecificProperty.checkingIfPangram isPangram = (string) -> {
            Set<Character> set = new HashSet<>();
            for (char c : string.toLowerCase().toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    set.add(c);
                }
            }
            return set.size() == 26 ? "Pangram" : "Not Pangram";
        };


        SpecificProperty.olderThanTwenty whetherOlder = (stringName, stringSurnamge, intAge) -> {
            if(intAge > 20){
                return "The person: " + stringName + " " + stringSurnamge + " is older than 20.";
            }
            return "The person: " + stringName + " " + stringSurnamge + " is not older than 20.";
        };

        if (isOdd.isOdd(number) == 1) {
            System.out.println("The number " + number + " is not odd");
        } else {
            System.out.println("The number " + number + " is odd");
        }

        if (isInFirst.isInFirst(point1, point2) == 1) {
            System.out.println("The point [" + point1 + ", " + point2 + "] is in first quadrant");
        } else {
            System.out.println("The point [" + point1 + ", " + point2 + "] is not in first quadrant");
        }

        if (isPangram.isPangram(inputString).equals("Pangram")) {
            System.out.println("Given string is Pangram");
        } else {
            System.out.println("Given string is not Pangram");
        }
        System.out.println(whetherOlder.whetherOlder(firstname, lastname, age));
    }
}