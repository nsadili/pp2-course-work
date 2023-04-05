public class CachingResultsTest {
    public static void main(String[] args) {
        String inputString = "abracadabra";
        
        // Test without caching
        System.out.println(CachingResults.getFrequentChars(inputString)); 
    
        // Test with caching
        System.out.println(CachingResults.getFrequentChars(inputString)); 
    
        // Test with different input string
        String newInputString = "hello world";
        System.out.println(CachingResults.getFrequentChars(newInputString)); 
    
        // Test with empty string
        String emptyString = "";
        System.out.println(CachingResults.getFrequentChars(emptyString)); 
    }
        
}
