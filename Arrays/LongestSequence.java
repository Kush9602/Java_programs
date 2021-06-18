import java.util.Arrays;;
public class LongestSequence {
    public static void main(String[] args){
        int arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};

        System.out.println(longestSequence(arr)); // longest sequence is  32,33,34,35,36
    }

    // time complexity = O(n.log(N))
    private static int longestSequence(int[] arr){
        int longestSequence = 1;
        int sequence = 1;
        Arrays.sort(arr);   // O(n.log(n))
        // [32,33,34,35,36,41,42,43,44,56,92] after sorting

        for(int i = 0; i < arr.length -1; i++){     // O(n)
            if(arr[i]+1 == arr[i+1])
                sequence++;
            else 
                sequence = 1;
            longestSequence = Math.max(longestSequence, sequence);
        }

        return longestSequence;
    }
}
