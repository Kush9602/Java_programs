import java.io.*;

public class DesireSum {
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the size of the array: ");
        int n = Integer.parseInt(in.readLine());    
        int array[] = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = Integer.parseInt(in.readLine());

        System.out.print("Enter your desire sum of tuples: ");
        int sum = Integer.parseInt(in.readLine());   

        getPairCount(array, sum);

    }    

    // Complexity is n^2 but we can reduce the complexity using HEARMAP
    static void getPairCount(int arr[], int s){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == s)
                    count++;
            }
        }
        System.out.print("Total pairs are: " + count);

    }
    
}
