public class MinAndMax {
    public static void main(String[] args){
        ArrayClasses ob = new ArrayClasses();

        int array[] = ob.getArray();
        System.out.println("Minimun element is: " + ob.minElememt(array));
        System.out.println("Maximun element is: " + ob.maxElememt(array));
    }
}
