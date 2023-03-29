import java.util.LinkedList;

public class StackAdt {
    public static void main(String[] args) {
        LinkedList<String> games = new LinkedList<>();
        
        games.push("gta V");
        games.push("Counter Strike - Global offensive");
        games.push("Call of Duty");
        
        System.out.println("Top game on the stack: " + games.peek());

        System.out.println("Popped game: " + games.pop());
        
        games.push("Valorant");
        
        System.out.println("Current stack:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}
