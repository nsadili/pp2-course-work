

public class CoinTossing {
    public static void main(String[] args){

        if (args.length == 0){
            System.out.println("Please, enter a value!");
            System.exit(0);
        } 

       int n = Integer.parseInt(args[0]);

       if (n < 1) {
        System.out.println("Print Positive Number");
        System.exit(0);
    }

            int OnFace; int CntHead = 0; int CntTail = 0;
            
       
            for (int i = 0; i < n; i++) {
                OnFace = (Math.random() * 2 < 1) ? 1 : 2;
       
           if (OnFace == 1) 
               //System.out.println("Head");
               CntHead++;
           else 
               //System.out.println("Tail");
               CntTail++;
           
              
            }
            System.out.printf("Tail : %d and Head : %d\n", CntTail, CntHead);
        }
    }
        
            

     
    
    

