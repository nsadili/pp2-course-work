package examples.Main1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    var list = new LinkedList<> ();
list.add ("Archie");
list.add ("X-Men");
Stream s = list.stream ();
s.forEach (System.out::println);
s.forEach (System.out::printIn);
}