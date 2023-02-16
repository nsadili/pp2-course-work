public class Demo {
    int x;
    float y;
   
    public void Demo(){
        this.x = 10;
        this.y = 5.0f;
    }
    
    public void Demo(int x){
        this.x = x;
        this.y = 5.0f;
    }
   
    public void Demo(int x, float y){
        this.x = x;
        this.y = y;
    }
    
    public static void main(String... s) {
     Demo d = new Demo(15, 25.0);
     
     System.out.println(d.x + ", " + d.y);
    } 
   }