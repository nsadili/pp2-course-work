import java.util.ArrayList;

class Test<T , U>
{
    T obj1;
    U obj2;
 
    Test(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
 
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
public class Practicing{
    public static void main(String[] args) {
        Test <String, Integer> obj1 = new Test<String, Integer>("Yunis", 25);
        Test <String, Integer> obj2 = new Test<String, Integer>("Fidan", 18);
        Test <String, Integer> obj3 = new Test<String, Integer>("Gulshan", 2005);
        Test <String, Integer> obj4 = new Test<String, Integer>("Programming Principles", 20282);
        Test <String, Integer> obj5 = new Test<String, Integer>("Fidan", 2005);

        ArrayList<Test> arr= new ArrayList<Test>();
        arr.add(obj1);
        arr.add(obj2);
        arr.add(obj3);
        arr.add(obj4);
        arr.add(obj5);

       
        
    }
}
