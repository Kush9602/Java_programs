// [1,2,3,-1,-2,-3] => [-1,1,-2,2,-3,3]

public class RearrangeArray {
    public static void main(String[] args){

        ArrayClasses ob = new ArrayClasses();
        int array[] = ob.getArray();

        int rearrange[] = reArrange(array);
        for(int i = 0; i < rearrange.length; i++)
            System.out.print(rearrange[i] + " ");
    } 

    static int[] reArrange(int arr[]){
        int point = 0, c = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0)
                continue;
            else if(arr[i] < 0){
                arr = swap(arr,point,c);
                point = point + 2;
            }
            c++;
        }
        return arr;
    }

    static int[] swap(int ar[] , int p1, int p2){
        int temp = ar[p1];
        ar[p1] = ar[p2];
        ar[p2] = temp;

        return ar;
    }
}
