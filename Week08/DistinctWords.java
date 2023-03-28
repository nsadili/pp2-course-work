import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class DistinctWords {
    public static void main(String[] args) {
        Collection<String> collection = initCollection();
        
        // Eliminate duplicate words while retaining order
        Set<String> uniqueWordsSet = new LinkedHashSet<>(collection);
        

        // Output unique words in original order
        System.out.println("Unique words in original order:");
        for (String word : uniqueWordsSet) {
            System.out.println(word);
        }

        // Output unique words in alphabetical order
        Set<String> uniqueSortedWordSet = new TreeSet<>(collection);
        System.out.println("\nUnique words in alphabetical order:");
        for (String word : uniqueSortedWordSet) {
            System.out.println(word);
        }
    }

    static Collection<String> initCollection() {
        var collection = new ArrayList<String>();
        Collections.addAll(collection, "Andrew", "Collins", "Ruth", "Clark", "Melissa", "Bell", "William", "Powell", "Ashley", "Perry",
        "Bonnie", "Jones", "Robert", "Jenkins", "Jonathan", "Long", "Edward", "Kelly", "Fred", "Evans", "Sara",
        "Gray", "Lois", "Jackson", "Mary", "Cook", "Daniel", "Davis", "Barbara", "Rivera", "Lori", "Patterson",
        "Theresa", "James", "Terry", "Sanders", "Norma", "Washington", "Sharon", "Phillips", "Martha", "Green",
        "Tina", "Torres", "Louise", "Ward", "Kimberly", "Brown", "Ryan", "Smith", "Johnny", "Russell", "Jose",
        "Morgan", "Russell", "Ramirez", "Sean", "Parker", "Steve", "Mitchell", "Matthew", "Nelson", "Philip",
        "Bryant", "Deborah", "Barnes", "Clarence", "Lee", "Eric", "Peterson", "Thomas", "Simmons", "Margaret",
        "Murphy", "Jack", "White", "Sandra", "Hill", "Bruce", "Martinez", "Angela", "Taylor", "Jeremy",
        "Foster", "John", "Reed", "David", "Wilson", "Carolyn", "Coleman", "Stephanie", "Hughes", "Rose",
        "Robinson", "Shawn", "Edwards", "Cheryl", "Morris", "Benjamin", "Lopez", "Elizabeth", "Bennett",
        "Frances", "Roberts", "Kenneth", "Scott", "Anna", "Baker", "Diane", "Wood", "Tammy", "Harris", "Moore",
        "Marilyn", "Anderson", "Ruby", "Campbell", "Christine", "Richardson", "Jean", "Rodriguez", "Jason",
        "Garcia", "Adams", "Kevin", "Henderson", "Victor", "Bailey", "Julia", "Wright", "Randy", "Thompson",
        "Brandon", "Gonzalez", "Donald", "King", "Amanda", "Price", "Phyllis", "Hall", "Stewart", "Lawrence",
        "Cooper", "Peter", "Adams", "Kevin", "Henderson", "Victor", "Bailey", "Julia", "Wright", "Roy",
        "Martin", "Chris", "Howard", "Irene", "Flores", "Donna", "Thomas", "Nancy", "Young", "Willie", "Brooks",
        "Ernest", "Moore", "Marilyn", "Walker", "Marie", "Turner", "Wayne", "Hernandez", "Todd", "Miller",
        "Nicole", "Sanchez", "Linda", "Griffin", "Michelle", "Stewart", "Betty", "Butler", "Diaz", "Mark",
        "Cox", "Christina", "Ernest", "Moore", "Marilyn", "Anderson", "Ruby", "Campbell", "Christine",
        "Richardson", "Jean", "Rodriguez", "Jason", "Garcia", "Adams", "Kevin", "Henderson", "Victor", "Bailey",
        "Julia", "Wright", "Roy", "Martin", "Chris", "Howard", "Irene", "Flores", "Donna", "Thomas", "Nancy",
        "Young", "Willie", "Brooks", "Ernest", "Moore", "Marilyn", "Walker", "Marie", "Turner", "Wayne",
        "Gerald", "Watson", "Nicholas", "Alexander", "Ann", "Carter", "Kathy", "Perez", "Juan", "Gonzales",
        "Gary", "Allen", "Carl", "Ross", "Jessica", "Rogers", "Rebecca", "Johnson", "Janice", "Lewis", "Julie",
        "Williams", "Judy", "Diaz", "Mark", "Cox", "Heather");

        return collection;
    }
}