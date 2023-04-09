package specProperties;

public interface SpecificProperty<T>{
    
     boolean check(T obj); 
    // It is not mandatory to use the keyword "abstract" in a method of an interface. Because, they are all implicitly abstract (and public).
}


