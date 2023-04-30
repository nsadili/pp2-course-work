package practicalwork;

public class FunctionalInterface {
	
    public static void main(String[] args) {
    	
        AFunction instance = new AFunction() {
        	
            @Override
            public void apply(String input) {
            	
                System.out.println(input + input);
                
            }
        };
        
        instance.apply("string");
        
        AFunction.print("string");
        
        instance.print("string", "string");

        AFunction lambda = input -> System.out.println(input + input);
        lambda.apply("string");
        AFunction.print("string");
        lambda.print("string", "string");
    }
}
