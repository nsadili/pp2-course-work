package Enums;

class MyEnums {
    enum Color { Red, Green, Blue, White, Black, Gray, Yellow};
    }
    
    public class EnumTest {
    public static void main(String[] args) {
    try {
    MyEnums.Color argCol = MyEnums.Color.valueOf(args[0]);
    System.out.println("Exists: " +argCol);
    }
    catch (java.lang.IllegalArgumentException iae) {
    System.out.println(args[0]+" does not exist. ");
    MyEnums.Color colors [] = MyEnums.Color.values();
    System.out.println("Choose one the following colors: ");
    for (MyEnums.Color c : colors)
    System.out.println(" - "+c);
    }
    }
    }
    
