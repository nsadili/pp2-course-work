import java.util.*;

public class SpecificProperty {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(32);
        A.add(69);
        A.add(12);
        A.add(55);

        List<String> B = new ArrayList<>();

        B.add("pendir");
        B.add("kelek");
        B.add("qatiq");
        B.add("katlet");
        B.add("deified");

        List<Account> C = new ArrayList<>();
        C.add(null);
        C.add(new Account(null, null, 15));
        C.add(null);
        C.add(new Account(null, null, 234));
        
        System.out.println("Number of even integers: " + countEvenNumbers(A));
        System.out.println("Number of palindrome strings: " + countPalindromes(B));
        System.out.println("Number of empty accounts: " + countEmptyAccounts(C));
    }

    static class Account {
        private String firstname;
        private String lastname;
        private int age;


        Account(String firstname, String lastname, int age) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
        }

        String getFirstName() {
            return firstname;
        }

        String getLastName() {
            return lastname;
        }

        int getAge() {
            return age;
        }

        public int getBalance() {
            return 0;
        }   
        
    }

    public static int countEvenNumbers(List<Integer> list) {
        int count = 0;
        for (Integer num : list) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countPalindromes(List<String> list) {
        int count = 0;
        for (String str : list) {
            String reverse = new StringBuilder(str).reverse().toString();
            if (str.equals(reverse)) {
                count++;
            }
        }
        return count;
    }

    public static int countEmptyAccounts(List<Account> list) {
        int count = 0;
        for (Account account : list) {
            if (account == null || account.getBalance() == 0) {
                count++;
            }
        }
        return count;
    }

    public interface Test<T> {
        boolean test(T t);
    }

    Test<Integer> isOdd = n -> n % 2 != 0;

    Test<Point> isFirstQuadrant = p -> p.getX() >= 0 && p.getY() >= 0;

    Test<String> isPanagram = s -> s.chars().filter(Character::isAlphabetic).distinct().count() == 26;

    Test<Account> isOlderThan20 = p -> p.getAge() > 20;

    class Point{
        private int x;
        private int y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}