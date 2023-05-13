public class Pw_2_SpecificProperty {
    public static void main(String[] args) {

        //a. Here are the lambda expressions for the multiple implementations of SpecificProperty:
        //i. Check if the integer is odd:
        SpecificProperty<Integer> isOdd = n -> {
            return (n % 2) != 0;
        };

        //ii. Check if the point is in the first quadrant:
        SpecificProperty<Point> isFirstQuadrant = p -> p.getX() > 0 && p.getY() > 0;

        //iii. Check if the given string is Panagram:
        SpecificProperty<String> isPangram = s -> {
            String lowerCaseStr = s.toLowerCase();
            for(char ch = 'a'; ch <= 'z'; ch++){
                if(lowerCaseStr.indexOf(ch) < 0){
                    return false;
                }
            }
            return true;
        };

        //iv. Check if the given Person is older than 20:
        SpecificProperty<Person> isOlderThan20 = person -> person.getAge() > 20;

        //b. Here is the implementation of the filter method:
        public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
            List<T> filteredList = new ArrayList<>();
            for (T element : c) {
                if (p.isSatisfied(element)) {
                    filteredList.add(element);
                }
            }
            return filteredList;
        }

    }
}
