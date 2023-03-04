public class NestedDemoTest {
    
    public static void main(String[] args) {
        
        NestedDemo nd = new NestedDemo();
        NestedDemo.InnerClass ic = nd.new InnerClass();
        NestedDemo.StaticNestedClass scl = new NestedDemo.StaticNestedClass();

    }
}
