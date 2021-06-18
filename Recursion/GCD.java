
public class GCD {
    public static void main(String[] args){
        int a = 10, b = 45;
        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b){
        if(a == 0)
            return b;
        
        return gcd(b%a, a); 
    }
    
}
