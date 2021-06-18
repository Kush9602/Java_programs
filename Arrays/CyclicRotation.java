public class CyclicRotation {
    public static void main(String[] args){
        ArrayClasses ob = new ArrayClasses(); 
        int array[] = ob.getArray();

        int rot[] = rotation(array);
        System.out.print("After rotating array cyclicly: ");
        ob.printArray(rot);
    }

    static int[] rotation(int arr[]){
        int len = arr.length - 1;
        int temp = arr[len];
        len--;
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[len];
            len--;
        }
        arr[0] = temp;
        return arr;
    }
    
}
