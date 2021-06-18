public class RadixSorting {
    public static void main(String[] args){
        int[] array = {170,40,70,90,800,20,200,60};


        array = radixSort(array);
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
    }

    private static int[] radixSort(int[] arr){
        int max = getMax(arr);

        for(int div = 1; max / div > 0; div *= 10)
            arr = countingSort(arr, div);
        
        return arr;
    }

    private static int[] countingSort(int[] arr, int div){
        int[] count = new int[10];

        for(int i = 0; i < arr.length; i++)
            count[(arr[i]/div)%10]++;

        for(int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        int[] output = new int[arr.length];
        
        for(int i = arr.length - 1; i >= 0 ; i--){
            int index = count[(arr[i]/div)%10] - 1;
            output[index] = arr[i];
            count[(arr[i]/div)%10]--;
        }

        for(int i = 0; i < arr.length; i++)
            arr[i] = output[i];

        return arr;
    }

    private static int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
