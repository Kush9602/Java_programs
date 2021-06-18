// A Balanced number is one by removing that number the sum of even places and sum of odd places are equal

import java.util.*;
public class BalancedNumber {
    public static void main(String[] args){
        
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        
        l1.add(2);
        l1.add(1);
        l1.add(6);
        l1.add(4);
        // System.out.println(l1);
 
        System.out.println(solve(l1)); // e.g - by removing 1 , sum of even(i.e 2 + 4 = 6) equals to sum of odd(i.e 6)
    }

    // BUT THIS SOLUTION IS NOT EFFICIENT AND IT HAS VERY HIGH COMPLEITY(N^2)
    //finding total Balanced Number
    public static int solve(LinkedList<Integer> A) {
        int specNumber = 0;
        
        for(int i = 0 ; i < A.size(); i++){
            int evenSum = 0, oddSum = 0;
            LinkedList<Integer> temp = new LinkedList<Integer>(A);
            temp.remove(i);
            
            for(int j = 0; j < temp.size(); j++){ 
                if(j % 2 == 0)
                    evenSum += temp.get(j);
                else
                    oddSum += temp.get(j);
            }
            
            if(evenSum == oddSum)
                specNumber++;
        }
        
        return specNumber;
    } 
}
