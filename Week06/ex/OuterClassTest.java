public class OuterClassTest {
    public static void main(String[] args) {
        
        OuterClass a = new OuterClass();
        OuterClass.InnerClass b = a.new InnerClass();
       // OuterClass.StaticNestedClass c = a.new StaticNestedClass(); 
      // you cannot access to the OuterClass variables --> because of static nested class:)
      OuterClass.StaticNestedClass c = new OuterClass.StaticNestedClass();

       System.out.println(a.class_);
       System.out.println(b.x);
    }
}