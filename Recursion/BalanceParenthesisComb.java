//Given a nonnegative integer n, write a function that lists all strings formed from exactly n
//pairs of balanced parentheses. For example, given n = 3, you'd list these five strings:
//  ((())) (()()) (())() ()(()) ()()()

import java.util.*;
public class BalanceParenthesisComb {
    public static void main(String[] args){

        HashSet HS = totalBalancedParenthesis(4);
        System.out.println(HS);
    }    

    private static HashSet<String> totalBalancedParenthesis(int n){
        if(n == 0){
            HashSet<String> HS = new<String> HashSet();
            HS.add("");
            return HS;
        }

        HashSet<String> combs = totalBalancedParenthesis(n-1);
        HashSet<String> pair = new<String> HashSet();

        for(String set: combs){
            pair.add("("+set+")");
            pair.add("()"+set);
            pair.add(set+"()");
        }

        return pair;
    }
}
