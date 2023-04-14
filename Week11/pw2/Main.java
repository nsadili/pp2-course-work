package pw2;

public class Main {
    public static void main(String[] arg) {
        SpecificProperty<Integer> isOdd= arg1 -> arg1%2!=0;
        SpecificProperty<Point> inFirstQuadrant= arg1 -> arg1.getX()>0  && arg1.getY()>=0;
        SpecificProperty<String> isPanagram= arg1 -> {
            boolean[] mark = new boolean[26];
 
        // For indexing in mark[]
        int index = 0;
 
        // Traverse all characters
        for (int i = 0; i < arg1.length(); i++) {
            // If uppercase character, subtract 'A'
            // to find index.
            if ('A' <= arg1.charAt(i)
                && arg1.charAt(i) <= 'Z')
                index = arg1.charAt(i) - 'A';
 
            // If lowercase character, subtract 'a'
            // to find index.
            else if ('a' <= arg1.charAt(i)
                     && arg1.charAt(i) <= 'z')
 
                index = arg1.charAt(i) - 'a';
 
            // If this character is other than english
            // lowercase and uppercase characters.
            else
                continue;
            mark[index] = true;
        }
 
        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
 
        // If all characters were present
        return (true);
        };

        SpecificProperty<Person> isOlderthan20 = arg1 -> arg1.getAge()>19;

        System.out.println(isOdd.test(5));
        System.out.println(isOlderthan20.test(new Person(20, "Nasib", "Pashayev")));;
        System.out.println(isPanagram.test(" brown fox jumps over the lazy dog"));
        System.out.println(inFirstQuadrant.test(new Point(5, -10)));;
    }
}

