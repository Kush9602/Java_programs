import java.util.*;
public class BalancedParenthesis {
    public static void main(String[] args){
        String parenthesis = "(())";

        balancedParenthesisStack(parenthesis);

        if(balancedParenthesis(parenthesis) == 0)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

    // return 0 if balanced else 1
    private static int balancedParenthesis(String str){
        int open = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(')
                open++;
            else{
                open--;
                if(open < 0)
                    return 1;
            }
        }   

        if(open > 0)
            return 1;
        
        return 0;
    }

    // using stack
    private static void balancedParenthesisStack(String str){
        Stack<Character> myStack = new Stack<Character>(); 
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(')
                myStack.push(str.charAt(i));
            else{
                if(myStack.isEmpty() == false && myStack.peek() == '(')
                    myStack.pop();
                else{
                    System.out.println("Not Balanced");
                    return;
                } 
            }
        }

        if(myStack.isEmpty()){
            System.out.println("Balanced");
            return;
        }

        System.out.println("Not Balanced");
    }
}
