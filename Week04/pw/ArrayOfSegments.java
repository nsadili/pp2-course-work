public class ArrayOfSegments {
    public static void main(String[] args){
        //didnt understand what segment means, just assume it like an object with 3 property, 3rd is lengthh
        int[][] segments = {{3,6,1},{5,9,2},{5,9,0},{1,2,2},{5,0,3}};
        int[][] results = findMaxLength(segments);
        for(int[] a: results){
            System.out.println("Segments with biggest length :"+Integer.toString(a[0]) + " :"+Integer.toString(a[1])+" length:"+Integer.toString(a[1]));
        }
    }

    static int[][] findMaxLength(int[][] segments){
        int maxY= Integer.MIN_VALUE;
        int[] indexOfMax = {};
        for(int i=0;i<segments.length;i++){
            if(segments[i][2]>maxY){
                maxY = segments[i][1];
            }
        }

        for(int i=0;i<segments.length;i++){
            if(segments[i][1]==maxY){
                int[] tmp = indexOfMax;
                indexOfMax = new int[tmp.length+1];
                for(int ii=0;ii<tmp.length;ii++){
                    indexOfMax[ii]=tmp[ii];
                }
                indexOfMax[tmp.length] = i;
            }
    }

    int[][] results = new int[indexOfMax.length][3];
        for(int i=0;i<indexOfMax.length;i++){
            results[i][0] = segments[indexOfMax[i]][0];
            results[i][1] = segments[indexOfMax[i]][1];
            results[i][2] = segments[indexOfMax[i]][2];
        }
        return results;}
}
