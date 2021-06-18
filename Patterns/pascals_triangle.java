// Pascal’s triangle is a pattern of the triangle which is based on nCr.
//                      i.e. n!/(n-r)!r!

public class pascals_triangle {

    // take factorial
    static int factorial(int n){
        if(n == 1 || n == 0)
            return 1;

        return n * factorial(n - 1);
    } 

    static int ncr(int n, int r){
        return factorial(n) / (factorial(n-r)*factorial(r) );
    }

    public static void main(String[] args){
        int m = 5;
        for(int i = 0; i < 5; i++){
            for(int j = 1 ; j < m; j++)
                System.out.print(" ");
            for(int k = 0; k <= i; k++){

                System.out.print(ncr(i,k) + " ");
            }
            System.out.println();
            m--;
        }
    }
}
