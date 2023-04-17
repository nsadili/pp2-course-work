package pp2.week11;
public class SpecificProperties {
   public static class Point{
        private int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;  }
    }
    public static class Person{
        private String firstName, lastName;
        private int age;
        public Person(String firstname,String lastname,int age){
            this.age=age;
            this.lastName=lastname;
            this.firstName=firstname;        }
        public String getFirstname() {
            return firstName;        }
        public String getLastname() {
            return lastName;
        }
        public int getAge() {
            return age;
        }
        interface SpecificProperty<P> {
            boolean check(P n);
        }
        public static void main(String[] args) {
            Point point= new Point(0, 5);
            Person person = new Person("Khavar", "Baghirova", 17);
            SpecificProperty<Point> isInFirst=(n)-> n.getX()>=0 && n.getY()>=0;
            SpecificProperty<Integer> isOdd=(n)-> n%2!=0;
            SpecificProperty<Person> isOld=(n)-> n.getAge()>20;
            SpecificProperty<String> isPanagram=(n)-> {
                boolean[] mark = new boolean[26];
                int index = 0;
                for (int i = 0; i < n.length(); i++) {
                    if ('A' <= n.charAt(i) && n.charAt(i) <= 'Z')
                        index = n.charAt(i) - 'A';
                else if ('a' <= n.charAt(i)
                        && n.charAt(i) <= 'z')
                    index = n.charAt(i) - 'a';
                else continue;
                    mark[index] = true;
                }
                for (int i = 0; i <= 25; i++)
                    if (!mark[i])  return (false);
                return (true);};
            System.out.println("First quadrant: "+isInFirst.check(point));
            System.out.println("Odd: "+isOdd.check(9));
            System.out.println("Older than 20: "+isOld.check(person));
            System.out.println("Panagram: "+ isPanagram.check("Hello World "));

        }

}}
