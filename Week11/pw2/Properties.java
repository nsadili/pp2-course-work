package pw11;

public class Properties {
    SpecificProperty<Integer> isOdd = (num) -> num % 2 != 0;

    SpecificProperty<Point> isInFirstQuadrant = (point) -> point.getX() > 0 && point.getY() > 0;

    SpecificProperty<String> isPanagram = (str) -> {
        String lowerCaseStr = str.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (lowerCaseStr.indexOf(ch) < 0) {
                return false;
            }
        }
        return true;
    };
    SpecificProperty<Person> isOlderThan20 = (person) -> person.getAge() > 20;
}
