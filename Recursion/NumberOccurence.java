public class NumberOccurence {
    public static void main(String[] args){
        int[] arr = {2,3,9,8,7,3,6,4,12,7,3,8}; 
        // System.out.println(findOccurence(arr, 3, 0));
        // System.out.println(lastOccurence(arr, 3, arr.length - 1));
        int a[] =  allOccurence(arr, 3, 0, 0);
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        
    }

    // return first index of the number
    private static int findOccurence(int[] arr, int num, int index){
        if(index == arr.length)
            return -1;

        if(arr[index] == num)
            return index;

        return findOccurence(arr, num, index + 1);
    }

    // return last index of the number
    private static int lastOccurence(int[] arr, int num , int index){
        if(index < 0)
            return -1;
        
        if(arr[index] == num)
            return index;
        
        return lastOccurence(arr, num, index - 1);
    }

    // return array of all index of the number
    private static int[] allOccurence(int[] arr, int num, int index, int count){
        if(index == arr.length)
            return new int[count];

        if(num == arr[index])
            count++;
            
        int[] occur = allOccurence(arr, num, index + 1, count);

        if(arr[index] == num)
            occur[--count] = index;

        return occur;
    }
}
