public class CountingSort {
    
    public static void main(String[] args){
        CountingSort ob = new CountingSort();
        int[] array = {9,6,7,5,4,1,3,0,5,4,6,9,7};
        
        int[] sort = ob.countSort(array);
        for(int i = 0; i < sort.length; i++)
            System.out.print(sort[i] + " ");  
    }

    public int[] countSort(int[] arr){
        int max = max(arr);
        int[] count = new int[max+1];
        
        for(int i = 0; i < arr.length; i++)   // increase the counter at array_element = index_no of count
            count[arr[i]]++;                  // like if there are 4 2's then we put the 2nd index of count = 4
        
        for(int i = 1; i < count.length; i++)  // calculate the position of that index of count
            count[i] += count[i - 1]; 
        

        int[] sorted = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int index = count[arr[i]] - 1; 
            sorted[index] = arr[i];
            count[arr[i]]--;
        }
        return sorted;
    }

    private static int max(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
