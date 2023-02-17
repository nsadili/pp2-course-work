public class ArrayOfPoints {
    public static void main(String[] args){
        int[][] points = {{1,3},{-2,4},{5,-1},{0,-4},{3,10},{0,10}};
        int results[][] = findMostNorthern(points);

        for(int[] a: results){
            System.out.println("Most Northern: X:"+Integer.toString(a[0]) + " Y:"+Integer.toString(a[1]));
        }
    }


    static int[][] findMostNorthern(int[][] points){
        //understand, most northern is the biggest Y
        int maxY= Integer.MIN_VALUE;
        int[] indexOfMax = {};
        for(int i=0;i<points.length;i++){
            if(points[i][1]>maxY){
                maxY = points[i][1];
            }
        }

        for(int i=0;i<points.length;i++){
            if(points[i][1]==maxY){
                int[] tmp = indexOfMax;
                indexOfMax = new int[tmp.length+1];
                for(int ii=0;ii<tmp.length;ii++){
                    indexOfMax[ii]=tmp[ii];
                }
                indexOfMax[tmp.length] = i;
            }
        }

        int[][] results = new int[indexOfMax.length][2];
        for(int i=0;i<indexOfMax.length;i++){
            results[i][0] = points[indexOfMax[i]][0];
            results[i][1] = points[indexOfMax[i]][1];
        }

        return results;
    }
}
