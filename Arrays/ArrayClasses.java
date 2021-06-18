import java.util.Scanner;
import java.io.*;
public class ArrayClasses {
    Scanner scan = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //  This function return a array
    public int[] getArray(){ 
        System.out.print("Enter the size of array: ");
        int n = scan.nextInt();
        int array[] = new int[n];   
        System.out.println("Enter array element: ");
        for(int i = 0; i < n; i++)
            array[i] = scan.nextInt();
        return array; 
    }

    // return string array
    public String[] getStringArray()throws IOException{
        System.out.print("Enter array in a row");
        String array[] = reader.readLine().split(" ");
        return array;
    }

    // This finction print array
    public void printArray(int ar[]){
        for(int i = 0; i < ar.length; i++)
            System.out.print(ar[i] + " ");
        System.out.println();
    }


    // This function count the frequency of a number "a" in an array. 
    public void frequency(int ar[], int a) {
        int count = 0;
        for(int i = 0; i < ar.length; i++ ){
            if(a == ar[i])
                count++;  
        }
        System.out.print(a + " repeats " + count + " times.");
    }


    // sorting of array
    public int[] sorting(int ar[]){
        int len = ar.length;
        int m = 1;
        for(int i = 0; i < len; i++){
            for(int j = m; j < len; j++){
                if(ar[i] > ar[j])
                    ar = swap(i,j,ar);
            }    
            m++;
        } 
        return ar;
    }


    // Swap two element of the array
    public int[] swap(int a, int b, int[] array){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        
        return array;
    
    }


    // kth smallest element in the array.
    public int kthSmallest(int ar[], int k){
        int kth = k - 1;
        int kthElement = ar[kth];
        return kthElement;
    }   


    // finds minimum element of an array.
    public int minElememt(int ar[]){
        int min = ar[1];

        for(int i = 0;i < ar.length;i++){
            if(min > ar[i])
                min = ar[i];
        }
        return min;
    }

    // find maximum element of an array.
    public int maxElememt(int ar[]){
        int max = 0;

        for(int i = 0;i < ar.length;i++){
            if(max < ar[i])
                max = ar[i];
        }
        return max;
    }

    // This method will reverse an array. 
    public int[] reverseArray(int ar[]){
        int length = ar.length;
        int reversed[] = new int[length];
        length = length - 1;

        for(int i = 0; i < ar.length; i++){
            reversed[i] = ar[length];
            length--;
        } 
        return reversed;
    }


    
}
