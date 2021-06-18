import java.util.Scanner;

public class SortingClass {
    Scanner scan = new Scanner(System.in);

    public int[] getArray(){
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int array[] = new int[size];

        for(int i = 0; i < size; i++)
            array[i] = scan.nextInt();

        return array;
    }

    public void printArray(int[] array){
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
