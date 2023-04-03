import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharactersOfWord {

    private Map<String, List<Character>> cache;

    public UniqueCharactersOfWord() {
        cache = new HashMap<>();
    }

    public List<Character> getUniqueChars(String word) {
        if (cache.containsKey(word)) {
            System.out.println("Answer retrieved from cache.");
            return cache.get(word);
        }
        List<Character> uniqueChars = new ArrayList<>();
        for (char c : word.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }
        cache.put(word, uniqueChars);
        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UniqueCharactersOfWord uc = new UniqueCharactersOfWord();
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(uc.getUniqueChars(word1));
        System.out.println(uc.getUniqueChars(word2));
        System.out.println(uc.getUniqueChars(word1));
    }
}
