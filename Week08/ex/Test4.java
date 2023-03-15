import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
hm.put(1, "Monday");
hm.put(2, "Tuesday");
Set keys = hm.keySet();
Iterator it = keys.iterator();
while (it.hasNext()) { 
Object key = it.next();
String value = (String) hm.get(key);
System.out.println("key="+key+" value="+value);
}
    }
}
