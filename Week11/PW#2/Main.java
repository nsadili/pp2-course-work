package SpecificProperty;

import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        SpecificProperty isOdd = (obj) -> ((int) obj) % 2 != 0;

        SpecificProperty isFirstQuadrant = (obj) -> {
            Point point = (Point) obj;
            return point.getX() > 0 && point.getY() > 0;
        };

        SpecificProperty isPangram = (obj) -> {
            String str = ((String) obj).toLowerCase();
            return str.chars().filter(Character::isLetter).distinct().count() == 26;
        };

        SpecificProperty isOlderThan20 = (obj) -> {
            Person person = (Person) obj;
            return person.getAge() > 20;
        };
    }
}
