public interface SpecificProperty<T> {
    boolean test(T a);
    public static void main(String[] args) {
        SpecificProperty<Integer> isOdd = a -> a%2!=0;
        SpecificProperty<Point> isQuadrant = p -> p.getX()>0 && p.getY()>0;
        SpecificProperty<String> isPanagram = b ->{
            boolean[] mark = new boolean[26];
            int index = 0;
            for (int i = 0; i < b.length(); i++){
                if ('A' <= b.charAt(i) && b.charAt(i) <= 'Z'){
                    index = b.charAt(i) - 'A';
                }else if ('a' <= b.charAt(i) && b.charAt(i) <= 'z'){
                    index = b.charAt(i) - 'a';
                } else continue;
                mark[index] = true;
            }
            for (int i = 0; i <= 25; i++){
                if (mark[i] == false) return (false);
            }
            return (true);
        };
        SpecificProperty<Person> isOlderThanTwenty = c -> c.getAge()>20 ? true : false;
        
        System.out.println(isOdd.test(5));
        System.out.println(isQuadrant.test(new Point(3, -4)));
        System.out.println(isPanagram.test("Hello my name is Nariman"));
        System.out.println(isOlderThanTwenty.test(new Person("Nariman", "Mammadov", 31)));
    }
}