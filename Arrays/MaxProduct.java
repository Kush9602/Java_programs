//  we have to find the maximum contiguous product sub-array
public class MaxProduct {
    public static void main(String[] args){
        int[] arr = { 1, -2, -3, 0, 7, -8, -2 };

        System.out.println("Max contiguous product: " + maxProduct(arr));
    }

    private static int maxProduct(int[] arr){
        int maxProduct = Math.abs(arr[0]);
        int product = 1;
        for(int i = 0; i < arr.length; i++){
            product *= Math.abs(arr[i]);
            maxProduct = Math.max(product, maxProduct);
            if(product <= 0)
                product = 1;
        }
        return maxProduct;
    }
}
