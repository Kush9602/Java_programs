//  1 1 2 3 5 8 13 21......

public class FibonacciNumber {
    public static void main(String[] args){

        System.out.println(fibonacciNumber(6));
        // fibonacciSeries(10);

        printFibonacci(1,1,10, 0);
    }

    private static int fibonacciNumber(int num){
        if(num == 1 || num == 2)
            return 1;

        return fibonacciNumber(num - 1) + fibonacciNumber(num - 2);
    }

    private static void printFibonacci(int last, int lastSecond, int n, int index){
        if(index == 0){
            System.out.print(lastSecond + " ");
            printFibonacci(last, lastSecond, n, index + 1);
            return;
        }
        if(index == 1){
            System.out.print(last + " ");
            printFibonacci(last, lastSecond, n, index + 1);
            return;
        }
        if(index == n){
            return;
        }
        
        int sum = last + lastSecond;
        System.out.print(sum + " ");
        printFibonacci(sum, last, n, index+1);

    }


    //using recursion
    // private static void fibonacciSeries(int n){
    //     for(int i = 1; i <= n; i++)
    //         System.out.print(fibonacciNumber(i) + " ");
    // }

    //using loop
    private static void fibonacciSeries(int n){
        int preNum = 0; 
        int nextNum = 1;
        int sum;

        System.out.print(preNum + " ");
        System.out.print(nextNum + " ");
        for(int i = 2; i <= n; i++){
            sum = preNum + nextNum;
            System.out.print(sum + " ");
            preNum = nextNum;
            nextNum = sum;
        }
    }
    
}
