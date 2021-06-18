// [1,-2,4,-5,6,7] => [-2,-5,1,4,6,7]  this  program give something like this
//     input             output

public class NegativeElement{
    public static void main(String[] args){
        ArrayClasses ob = new ArrayClasses();
        int array[] = ob.getArray();
        ob.printArray(negativeFirst(array));
    }


    // "complexity n^2" but this give result in the same sequence
    // [1,-2,4,-5,6,7] => [-2,-5,1,4,6,7]  this  program give something like this
    //    input             output

    static int[] negativeFirst(int[] ar){
        int change = 0, temp = 0;

        for(int i = 0; i < ar.length; i++){
            if(ar[i] < 0){
                temp = ar[i];
                ar = incrementer(ar, change, i);
                ar[change] = temp;
                change++;
            }
        }

        return ar;
    }

    static int[] incrementer(int ar[], int from, int to){
        int n = to - 1;
        for(int i = to; i > from; i--){
            ar[i] = ar[n];
            n--;
        }
        return ar;
    }
    
    // "complexity n" but the order of array element will change as they use swapping
    // static int[] rearrange(int arr[]){
    //     int change = 0, temp;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] < 0) {
    //             if (i != change) {
    //                 temp = arr[i];
    //                 arr[i] = arr[change];
    //                 arr[change] = temp;
    //             }
    //             change++;
    //         }
    //     }
    //     return arr;
    // }


}

