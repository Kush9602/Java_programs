import java.util.Scanner;
public class Sort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayClasses ob = new ArrayClasses();

        int array[] = ob.getArray();

        int[] sortedArray = ob.sorting(array);
        System.out.print("Sorted array is: ");

        ob.printArray(sortedArray);

        System.out.println();

        // for kth smallest element
        System.out.print("Enter value of k for Kth smallest element: ");
        int i = scan.nextInt();

        int elem = ob.kthSmallest(sortedArray, i);
        System.out.print("Kth smallest element is " + elem);
    }
}
