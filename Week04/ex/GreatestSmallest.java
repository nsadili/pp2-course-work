public class GreatestSmallest {
    public static void main(String[] args) {

        
            
            System.out.printf("min value: %d , max value: %d",minMAx(args)[0],minMAx(args)[1]);

        
    }

    public static int min(String[] args){
        var min=999999999;

        for(var s:args){
            var el=Integer.parseInt(s);
            if(el<min) min=el;
        }

        return min;
    }

    public static int max(String[] args){
        var max=-999999999;

        for(var s:args){
            var el=Integer.parseInt(s);
            if(el>max) max=el;
        }

        return max;
    }

    public static int[] minMAx(String[] args){
        var max=-999999999;

        for(var s:args){
            var el=Integer.parseInt(s);
            if(el>max) max=el;
        }
        var min=999999999;

        for(var s:args){
            var el=Integer.parseInt(s);
            if(el<min) min=el;
        }
        int[] arr=new int[]{min,max};
        return arr;

    }
}
