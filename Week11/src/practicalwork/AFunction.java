package practicalwork;

public interface AFunction {
	
    void apply(String input);
    
    static void print(String input) {
    	
        System.out.println(input);
        
    }
    default void print(String input1, String input2) {
    	
        System.out.println(input1);
        
        System.out.println(input2);
        
    }
}