import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"Apple", "Banana", "Cherry", "Lemon", "Mango", "Orange", "Pineapple", "Watermelon", "Avocado", "Broccoli", "Carrot", "Cauliflower", "Cucumber", "Eggplant", "Garlic", "Lettuce", "Mushroom", "Onion", "Pepper", "Potato", "Spinach", "Tomato", "Asparagus", "Bacon", "Beef", "Chicken", "Fish", "Ham", "Pork", "Shrimp", "Turkey", "Cheese", "Bread", "Butter", "Egg", "Milk", "Yogurt", "Chocolate", "Coffee", "Tea", "Juice", "Soda", "Water", "Beer", "Wine", "Champagne", "Margarita", "Martini", "Mojito", "Sangria", "Vodka", "Whiskey", "Cappuccino", "Latte", "Espresso", "Americano", "Croissant", "Donut", "Muffin", "Pancake", "Waffle", "Bagel", "Sandwich", "Hamburger", "Hotdog", "Pizza", "Sushi", "Tacos", "Burrito", "Curry", "Rice", "Noodles", "Pasta", "Salad", "Soup", "Stew", "Chili", "Barbecue", "Grilled", "Roast", "Baked", "Fried", "Steamed", "Boiled", "Gravy", "Ketchup", "Mayonnaise", "Mustard", "Ranch", "Sauce", "Syrup", "Vinegar", "Brownie", "Cake", "Cookie", "Pie", "Pudding", "Sorbet", "Tiramisu"};
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        int atts = 10;
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];
        String [] guessedLetters = new String[word.length()]; 
        System.out.println("Welcome to Hangman!");
        System.out.println("You have 10 guesses to guess the word.");
        System.out.println("Enter a letter to guess the word.");
        for(int i=0; i<word.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println(Arrays.toString(word.split("")));
        while(atts > 0) {
            System.out.println();
            System.out.print("Enter a letter: ");
            if(Arrays.equals(guessedLetters, word.split(""))) {
                System.out.println("You win!");
                break;
            }
            String guess = scn.next();
            if(word.contains(guess)) {
                System.out.println("Correct guess!");
                int index = word.indexOf(guess);
                guessedLetters[index] = guess + " ";
                for(int i=0; i<guessedLetters.length; i++) {
                    if(guessedLetters[i] == null) {
                        System.out.print("_ ");
                    }else {
                        System.out.print(guessedLetters[i]);
                    }
                }

            } else {
                System.out.println("Wrong guess!");
                atts--;
                for(int i=0; i<guessedLetters.length; i++) {
                    if(guessedLetters[i] == null) {
                        System.out.print("_ ");
                    }else {
                        System.out.print(guessedLetters[i]);
                    }
                }
                System.out.println();
                System.out.println(atts + " attempts left.");
            }
            
        }
        System.out.println("Game over!");
        System.out.println("The word was: " + word);
    }
}
