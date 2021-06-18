public class BubbleSorting {
    public static void main(String[] args){
        SortingClass ob = new SortingClass();
        int[] array = ob.getArray();
        ob.printArray(array);

        bubbleSort(array);
        ob.printArray(array);
    }

    static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int flag = 0;
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    flag = 1;
                }       
            }
            if(flag == 0)
                break;
        }
    }
}
