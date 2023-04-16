package pp2.week11;
import java.util.*;
public class SpecificProperty
{
    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {

            this.x = x;
            this.y = y;
        }

        public int getX()
        {
            return x;
        }

        public int getY() {
            return y;
        }
    }
public static class Person

{
    private String fname;
    private String lname;
    private int age;
    public Person(String firstname,String lastname,int age)
    {
        this.age=age;
        this.lname=lastname;
        this.fname=firstname;
    }
    public String getFirstname()
    {
        return fname;
    }
    public void setFirstname(String firstname)
    {
        this.fname = firstname;
    }
    public String getLastname()
    {
        return lname;
    }
    public void setLastname(String lastname)
    {
        this.lname = lastname;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}
    interface SpecificProperties<A>
    {
        boolean check(A n);
    }
    public static void main(String[] args) {
        Point point= new Point(888, 8);
        Person person = new Person("Ayla", "Ibrahimova", 18);

        SpecificProperties<Integer> isOdd=(n)-> n%2!=0;

        SpecificProperties<Point> isInFirst=(n)-> n.getX()>=0 && n.getY()>=0;

        SpecificProperties<String> isPanagram=(n)-> {
            boolean[] mark = new boolean[26];
            int index = 0;
            for (int i = 0; i < n.length(); i++)
            {
                if ('A' <= n.charAt(i)
                    && n.charAt(i) <= 'Z')
                    index = n.charAt(i) - 'A';
            else if ('a' <= n.charAt(i)
                    && n.charAt(i) <= 'z')
                index = n.charAt(i) - 'a';
            else                    continue;
                mark[index] = true;
            }
            for (int i = 0; i <= 25; i++)
                if (!mark[i])
                    return (false);

            return (true);
        };

        SpecificProperties<Person> isOld=(n)-> n.getAge()>45;
        System.out.println("Is odd: "+isOdd.check(9));
        System.out.println("Is in first quadrant: "+isInFirst.check(point));
        System.out.println("Is panagram: "+ isPanagram.check("I love The Cure"));
        System.out.println("Is older than 45: "+isOld.check(person));
    }
}
