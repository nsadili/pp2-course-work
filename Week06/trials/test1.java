package Week06.trials;

public class test1 {
    public static void main(String[] args) {
        enum Color { Red, Green, Blue, White, Yellow, Purple, Orange}
        // Color colors[] = Color.values();
        // for (Color c : colors)
        // System.out.println(c);
    
        Color col = Color.valueOf("Orange");
        System.out.println("There is " +col+" in our list");
        
    }
}
