public class MergeSorting {
    public static void main(String[] args){
        SortingClass obj = new SortingClass();
        int array[] = obj.getArray();

        mergeSort(array);
        obj.printArray(array);
    }

    private static void mergeSort(int[] arr){
        int n = arr.length;
        if(n < 2)
            return;
            
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        
        for(int i = 0; i < mid; i++)
            left[i] = arr[i];
        
        for(int i = 0; i < right.length ; i++)
            right[i] = arr[mid + i];
 
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right){
        int nL = left.length;
        int nR = right.length;
        int leftPointer = 0, rightPointer = 0, arrayPointer = 0;
    
        while(leftPointer < nL && rightPointer < nR){
            if(left[leftPointer] > right[rightPointer])
                arr[arrayPointer++] = right[rightPointer++];

            else
                arr[arrayPointer++] = left[leftPointer++];
        }        

        while(leftPointer < nL)
            arr[arrayPointer++] = left[leftPointer++];            

        while(rightPointer < nR)
            arr[arrayPointer++] = right[rightPointer++];  

    }
}
