public class Character {

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }
        
        String inputString = args[0];
        char[] chars = inputString.toCharArray();
        
        
        int[] indexes = new int[chars.length];
        for(int i=0; i<chars.length; i++) {
            indexes[i] = i;
        }
        
        
        for(int i=0; i<chars.length-1; i++) {
            for(int j=i+1; j<chars.length; j++) {
                if(chars[i] > chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                    
                    int tempIndex = indexes[i];
                    indexes[i] = indexes[j];
                    indexes[j] = tempIndex;
                }
            }
        }
        
        
        for(int i=0; i<chars.length; i++) {
            System.out.println(chars[i] + " " + indexes[i]);
        }
    }
}
