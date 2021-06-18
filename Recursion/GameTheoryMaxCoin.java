// we have to find the possible maximun coin sum 
// rules are: 1) There are two ppl playing this game and another person is intellegent as us
//            2) only onr coin can be picked at a time
//            3) coin can be picked either from left or from right

public class GameTheoryMaxCoin {
    public static void main(String[] args){
        int[] coinBucket = {1,5,70,3,2,4};

        System.out.println(maxCoin(coinBucket, 0, coinBucket.length - 1));
    }

    private static int maxCoin(int[] arr, int l, int r){
        if(l+1 == r)
            return Math.max(arr[l], arr[r]);
        

        return Math.max(arr[l] + Math.min(maxCoin(arr, l+2, r), maxCoin(arr, l+1, r-1)),
                        arr[r]+ Math.min(maxCoin(arr, l+1, r-1), maxCoin(arr, l, r-2)) );
    }
}
