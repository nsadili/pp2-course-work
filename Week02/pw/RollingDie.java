public class RollingDie {
    
    public static void main(String[] args){
       double res;

res = Math.random();


            if (res < 0.125) 
                System.out.println("1");
            
            else if (res<0.25) 
                System.out.println("2");
                else if (res<0.25) 
                System.out.println("3");
                else if (res<0.375) 
                System.out.println("4");
                else if (res<0.5) 
                System.out.println("5");
                else  
                System.out.println("6");
            
            }
        


    }
