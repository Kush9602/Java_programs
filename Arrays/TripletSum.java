import java.util.Arrays;
public class TripletSum {
    public static void main(String[] args){
        int[] arr = {12, 3, 4, 1, 6, 9};
        int reqSum = 24;

        // System.out.println(desireSum(arr, reqSum));
        System.out.println(optimizedSum(arr, reqSum));
    }

    // brute force method
    // complexity = O(n^3)
    static boolean desireSum(int[] arr, int sum){
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                        return true;
                    }
                }
            }
        }

        return false;
    }


    // optimized approach
    // complexity = O(n^2)
    static boolean optimizedSum (int[] arr, int sum){
        // sort the given array
        Arrays.sort(arr);

        int l, r;

        for(int i = 0; i < arr.length - 2; i ++){
            l = i + 1;
            r = arr.length - 1;

            while(l < r){
                if(arr[i] + arr[l] + arr[r] == sum){
                    System.out.println(arr[i] + ", " + arr[l] + ", " + arr[r]);
                    return true;
                }

                else if(arr[i] + arr[l] + arr[r] > sum)
                    r--;

                else    
                    l++;
            }
        }

        return false;
    }
}