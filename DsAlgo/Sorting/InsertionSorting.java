public class InsertionSorting {
    public static void main(String[] args){
        SortingClass ob = new SortingClass();
        int[] array = ob.getArray();
        ob.printArray(array);

        insertionSort(array);
        ob.printArray(array);
    }

    static void insertionSort(int[] arr){
        for(int i = 1; i <= arr.length - 1; i++){
            int x = arr[i];
            int j = i - 1;
            while(j >= 0 && x < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            } 
            arr[j + 1] = x;
        }
    } 
}
