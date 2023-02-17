public class minmax {
    public static void main(String[]args) {
        int[] nums = new int[args.length] ;
        for(int i=0 ; i<args.length ; i++) {
            nums[i] = Integer.parseInt(args[i]) ;
        }
        calculateMin(nums);
        calculateMax(nums) ;
    
    }
    
        private static int calculateMin(int[] nums){
            int min = Integer.MAX_VALUE ;
            for (int i=0 ; i<nums.length ; i++) 
            {
                if (nums[i]< min) {
                    min=nums[i] ;
                }
            }
            return min;
            
    
        }
        private static int calculateMax(int[] nums) {
            int max = Integer.MIN_VALUE ;
            for (int i=0 ; i<nums.length ; i++) 
            {
                if ( nums[i]>max ) {
                    max=nums[i] ;
                }
        }
        return max;

    }
}
