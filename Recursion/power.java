public class power {
    public static void main(String[] args){

        System.out.println(pow(2,5));
    }

 // Complexity = O(lon(n))
    private static int pow(int num, int power){
        if(power == 1)
            return num;

        int npn2 = pow(num, power/2);
        int np = npn2 * npn2;

        if(power%2 == 1)
            np *= num;
        
        return np;
    }


 // Complexity = O(n)
 // private static int pow(int num, int power){
 //     if(power == 1)
 //         return num;
 //     return num * pow(num, power - 1);
 // }
}
