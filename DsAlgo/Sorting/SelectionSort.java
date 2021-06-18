public class SelectionSort {
    public static void main(String[] args){
        SortingClass ob = new SortingClass();
        int[] array = ob.getArray(); 
        ob.printArray(array);

        SelectionSorting(array);
        ob.printArray(array);
    }

    static void SelectionSorting(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }       
            }
        }
    }
}
