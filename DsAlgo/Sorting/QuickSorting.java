public class QuickSorting {
    public static void main(String[] args){
        int[] array = {12,3,2,1,5,76,3,9};

        array = mergeSort(array, 0, 7);
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }    

    private static int[] mergeSort(int[] arr, int start, int end){

        if(start < end){
            int partitionIndex = partition(arr, start, end);
            mergeSort(arr, start, partitionIndex - 1);
            mergeSort(arr, partitionIndex + 1, end);
        }
        return arr;
    }

    private static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int partitionIndex = start;

        for(int i = start; i < end; i++){
            if(arr[i] < pivot){
                arr = swap(i, partitionIndex, arr);
                partitionIndex++;
            }
        }
        swap(partitionIndex, end, arr);

        return partitionIndex;
    }

    private static int[] swap(int a, int b, int[] arr){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;

        return arr;
    }
}
