package ex2;

public interface SpecificProperty<T> {
    boolean check(T obj);

    SpecificProperty<Integer> isOdd = obj -> (obj%2)!=0;

    SpecificProperty<Point> first = p -> (p.getX()>0 && p.getY()>0);

    SpecificProperty<String> panagram = str -> {
        str.toLowerCase();
        boolean[] alphabet = new boolean[26];
        int index = 0;
        for(int i=0; i < str.length(); i ++) {
            if ('A' <= str.charAt(i)
                    && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';
                alphabet[index] = true;
        }
        for(int i=0; i<=25; i++) 
            if(alphabet[i]==false) return false;

        return true;
  };

  SpecificProperty<Person> isOlder = person -> {
    if(person.getAge() > 20) return true;
    else return false;
  };
  
  public static void main(String[] args) {
    System.out.println(isOdd.check(5));
    System.out.println(first.check(new Point(1,2)));
    System.out.println(panagram.check("hello"));
    System.out.println(isOlder.check(new Person("Narmina", "Suleymanova", 25)));
  }
}

