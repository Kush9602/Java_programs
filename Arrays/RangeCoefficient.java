public class RangeCoefficient {
    public static void main(String[] args){

        ArrayClasses ob = new ArrayClasses();

        int array[] = ob.getArray();
        float min = ob.minElememt(array);
        float max = ob.maxElememt(array);
        System.out.println("Range is: " + (max - min)); // range = max - min
        System.out.println("Coefficient is: " + ((max - min)/(max + min)) );
    }
}
