import java.util.Map;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Collections;


public class CharacterOccurences
{
    public static void main(String[] args)
    {
    

        if(args.length > 0)
        {
            String str = args[0];
        
        

        TreeMap<Character, ArrayList<Integer>> charOccurence = new TreeMap<>();      

        for(int i = 0; i <str.length(); i++)
        {
            char c = str.charAt(i);

            if(charOccurence.containsKey(c))
            {
                charOccurence.get(c).add(i);
            }
            else
            {
                ArrayList<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                charOccurence.put(c, indexList);
            }
        }

        System.out.println("Characters and their indexes in increasing order : ");
        for(Map.Entry<Character, ArrayList<Integer>> entry : charOccurence.entrySet())
        {
            System.out.print(entry.getKey() + ": ");
            for(int index : entry.getValue())
            {
                System.out.print(index + " ");
            }
            System.out.println();
        }

        System.out.println("Characters and their indexes in decreasing order : ");
        ArrayList<Character> charListDesc = new ArrayList<>(charOccurence.keySet());
        Collections.reverse(charListDesc);
        for(char c : charListDesc)
        {
            System.out.print(c + ": ");
            for(int index : charOccurence.get(c))
            {
                System.out.print(index + " ");
            }
            System.out.println();

        }
        }
        else
        {
            System.out.println("Please, enter a string: ");
        }



    }

    

}