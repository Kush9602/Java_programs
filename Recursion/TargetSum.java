import java.util.*;
public class TargetSum {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int target = 70;

        targetSubset(arr, target, 0, 0, "");
        
    }

    private static void targetSubset(int[] arr, int target, int sum, int index, String set){
        if(sum == target){
            System.out.println(set);
            return;
        }
        else if(index >= arr.length)
            return;

        targetSubset(arr, target, sum + arr[index], index+1, set + arr[index] + " ");
        targetSubset(arr, target, sum, index+1, set);

    }
    
}
