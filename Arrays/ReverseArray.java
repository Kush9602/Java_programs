public class ReverseArray {
    public static void main(String[] args){
        ArrayClasses ob = new ArrayClasses();

        int array[] = ob.getArray();
        System.out.print("Original Array is : ");
        ob.printArray(array);
        System.out.print("Reversed Array is : ");
        ob.printArray(ob.reverseArray(array));
    }
}
