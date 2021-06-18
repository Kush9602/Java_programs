public class test {
    public static void main(String[] args){

        // int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 
        // System.out.println(maxSum(arr)); // {4,-1,2,1} = maxSum = 6
        // char a = 'k';
        // char b = 'k';
        // System.out.println(a == b);
        String str = "nitin";
        StringBuffer s1 = new StringBuffer(str);

        for(int i = 0; i < s1.length(); i++){
            System.out.println(s1.charAt(i));
        }
        

    }

    private static int maxSum(int[] arr){
        int maxSum = arr[0];
        int sum = 0;
        for(int i = 1; i < arr.length; i++){
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
            if(sum < 0)
                sum = 0;
        }
        return maxSum;
    }
}
