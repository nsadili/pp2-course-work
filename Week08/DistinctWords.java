package Week08;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class DistinctWords {
    public static void main(String[] args) {

        
        var myColl = initCollection();

        System.out.println(myColl.size());

        System.out.println(myColl);

        /*
        System.out.println(myColl.size());

        Set<String> uniqueWords = new HashSet<>(myColl);

        System.out.println(uniqueWords.size());
        */
    }

    static Collection<String> initCollection() {
        var collection = new TreeSet<String>();
        Collections.addAll(collection,
                "Andrew", "Collins", "Ruth", "Clark", "Melissa", "Bell", "William", "Powell", "Ashley", "Perry",
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
