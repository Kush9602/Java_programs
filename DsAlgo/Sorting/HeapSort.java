public class HeapSort {
    public static void main(String[] args){
        int[] arr = {15,5,20,2,17,30};

        heapSort(arr);
       
       for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }


    // building heap and then swapping root node to end node
    static void heapSort(int[] arr){
        // building a max heap
        for(int i = arr.length/2 - 1; i >= 0; i--)
            heapify(arr, i, arr.length);

        // swapping root to end element and recreate heap
        for(int i = arr.length - 1; i > 0; i--){
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    // creating a heap...Time complexity is O(n)
    static void heapify(int[] arr, int start, int end){
        int max = start;
        int leftChild = 2*start+1;
        int rightChild = 2*start+2;

        // check if left child is larger than max or not if larger then update larger to leftchild
        if(leftChild < end && arr[max] < arr[leftChild])
            max = leftChild;

        // check if right child is larger than max or not if larger then update larger to rightchild   
        if(rightChild < end && arr[max] < arr[rightChild])
            max = rightChild;
        
        // if max and start are not same then swap and swap and re-check the heap for max 
        if(max != start){
            swap(arr, start, max);
            heapify(arr, max, end);
        }
    }


    static void swap(int[] arr, int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
}