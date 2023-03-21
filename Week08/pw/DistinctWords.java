import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DistinctWords {
    public static void main(String[] args) {
        var myColl= initCollection();
       /*System.out.println(myColl.size());
        Set<String> uniqueWords= new HashSet<>(myColl);
        System.out.println(uniqueWords.size());*/
        System.out.println(myColl);

    }

    static Collection<String> initCollection() {
        var collection = new TreeSet<String>(new Comparator <String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);
            }
        });

        
        Collections.addAll(collection,
                "Aysel", "Nubar", "Mike", "Aydan", "Ahmad", "Elmira", "Gulshah", "Aytac", "David", "Pari",
                "Sara", "Fakhriyya", "Javid", "Javidan", "Max", "Lala", "Ismayil", "Aziza", "Durna", "Rafig", "Nemat",
                "Adila", "Bashkhanim", "Komunali", "Tamara", "Jafar", "Bahlul", "Adam", "Ali", "Nijat", "Fazil", "Kamila",
                "Salim", "Gulnar", "Aysu", "Laman", "Faramaz", "Anar", "Arzu", "Dunya", "Melisa", "Muradkhan",
                "Samin", "Turkhan", "Gulsabah", "Pustekhanim", "Asmar", "Malahat", "Sharafat", "Eldar", "Elnur", "Eyvaz", "Alakbar",
                "Mehman", "Tofig");

        return collection;
    }
}