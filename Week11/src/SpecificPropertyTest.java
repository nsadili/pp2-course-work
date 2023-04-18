import java.util.Scanner;

interface SpecificProperty<T> {
    boolean test(T valueT);
}


class PanagramChecker implements SpecificProperty<String> {
    @Override
    public boolean test(String s) {
        return s.toLowerCase().chars().filter(Character::isAlphabetic).distinct().count() == 26;
    }
}

 class SpecificPropertyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpecificProperty<String> panagramChecker = (String s) -> s.toLowerCase().chars().filter(Character::isAlphabetic).distinct().count() == 26;
        String  panagram = sc.nextLine();
        String  panagram2 = sc.nextLine();
        System.out.println(panagramChecker.test(panagram)); 
        System.out.println(panagramChecker.test(panagram2)); 
        
    }
}
