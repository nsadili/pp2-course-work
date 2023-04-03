import java.util.*; //this import helps us to import all the classes in the java.util package including those what we need: HashMap, TreeMap etc.

//writing main class by writing the name same to the name of the file (Exercsie_3.java)
/*
1. Our first step is to create a HashMap and name it "ages". Then we add names and ages by themselves to the Map. 
2. Now, we start to print the information from Map. The first way to do it using enhanced for statement. The purpose of it
is to make our infomration more readable. The difference with others include the process of iteration of all 
values from the Map. It allows us to consider all of them and retrieve a corresponding value of each object there.
3. Let's continue using Iterator. Imagine a book with millions of names and phone numbers. We have fingers or finger, which moves
along all of them and changes the pages in the reason of apperance of the demand. So iterator plays the role of the finger for our
Map. Actually, it's low-level approach to iterating over the -values of a Map and gives us
more control over the iteration process. The output with the previous method the same, because the purpose of them is the same too. 
4. Ultimately, toString method is a built-in method of the Map interface that returns a String representation of the Map. It's very simple
to understand it. The purpose of it is outputing the results using a specific template. The template is based on providing information
in curly brackets using commas to distinguish the identification of each object in the bracket.
 */

public class Exercise_3 {
    public static void main(String[] args) {
        
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);

        System.out.println("Keys with associated values using enhanced for statement:");
        for (String key : ages.keySet()) {
            System.out.println(key + " : " + ages.get(key));
        }

        System.out.println("Keys with associated values using iterator:");
        Iterator<String> iterator = ages.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " : " + ages.get(key));
        }

       
        System.out.println("Keys with associated values using toString() method:");
        System.out.println(ages.toString());

            /*
        In this part we show our output using HashMap, LinkedMap and TreeMap. Instead of explaining the process of implementation, I rather
        say you the main difference betweeen them, because the syntaxix is actually similiar. 
        HashMap - HashMap is the most basic implementation of a map. It stores values in a hash table, which provides fast 
        access to elements based on their keys. However, it does not maintain any specific order of the entries, means that
        showing output will be implemented randomly. 
        LinkedHashMap - LinkedHashMap is similar to HashMap but maintains the order of the entries in which they were inserted.
        TreeMap - TreeMap implementation that maintains the entries in a sorted order based on the keys.When you iterate over 
        a TreeMap, you will get the entries in sorted order based on the keys. 
         */
  

        Map<String, Integer> hashMap = new HashMap<>(ages);
        System.out.println("HashMap: " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(ages);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>(new Comparator<String>() {
            public int compare(String str1, String str2) {
                return str2.compareTo(str1);
            }
        });
        treeMap.putAll(ages);
        System.out.println("TreeMap: " + treeMap);
        
    }
}

/*
Please, that Comparator was used, so TreeMap will show the results in an alphabetic order. Previously, it showed to us the 
outpu based on already input results. The principle of comparator is in comparison of values in our Map. 
Answering bonus question: 
There's no impossible things in programming. Yes, we can do it by sorting the list using the custom Comparator, previsouly defining it: 
Comparator<Map.Entry<String, Integer>> valueComparator = (e1, e2) -> e2.getValue().compareTo(e1.getValue());
Collections.sort(entryList, valueComparator);
Using them in our code will show as a well-sorted output.
 */

