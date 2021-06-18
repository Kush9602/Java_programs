import java.util.Arrays;
public class GcdOfRange {
    public static void main(String[] args){
        int[] arr = {2, 3, 60, 90, 50};
        int gcd = gcdInRange(arr, 2, 4);
        System.out.println("GCD is: " + gcd);
    }

    private static int gcdInRange(int [] arr, int low, int high){
        int min = getMin(arr, low, high);
        boolean minDivision = false;
        for(int i = low; i <= high; i++){
            if(arr[i] % min == 0)
                minDivision = true;
            else{
                minDivision = false;
                break;
            }
        }           
        if(minDivision == true)
            return min;

        min = (int)Math.ceil((double)min/2);
        for(int i = min; i > 1; i--){
            for(int j = low; j <= high; j++){
                if(arr[j]%i == 0)
                    minDivision = true;   
                else{
                    minDivision = false;
                    continue;
                }
                min = i;
            }
            if(minDivision == true)
                return min;
        }

        return min;
    }

    private static int getMin(int[] array, int low, int high){
        int min = array[low];
        for(int i = low + 1; i <= high; i++){
            if(array[i] < min)
                min = array[i];
        }    

        return min;
    }
}
