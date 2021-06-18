// we can move in all 8 directions.
// from (0,0) to (1,1) => 1 step and from (1,1) to (1,2) => 1 step 
// total 2 steps

public class Solution {
    public static void main(String[] arg){
        int[] a = {0,1,1};      // x axis co-ordinates
        int[] b = {0,1,2};      // y axis co-ordinates

        int step = coverPoints(a,b);
        System.out.println(step);

    }
    

    // calculate step to move from one point to another.
    public static int coverPoints(int[] arr, int[] brr) {
        int step = 0;
        for(int i = 0; i < arr.length - 1; i++){
            int xdiff = Math.abs(arr[i] - arr[i+1]);
            int ydiff = Math.abs(brr[i] - brr[i+1]);
            step += Math.max(xdiff, ydiff);
        }

        return step;
    }
}
