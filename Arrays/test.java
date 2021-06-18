import java.util.*;

public class test{
    public static void main(String[] args){
    
        System.out.println(fact(20));

    }

    private static long fact(int a){
        if(a <= 1)
            return 1;
        return a * fact(a-1);
    }
}
