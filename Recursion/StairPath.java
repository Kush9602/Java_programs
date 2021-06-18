import java.util.*;

public class StairPath {
    private static int[] possibleSteps = {1, 2, 3};
    public static void main(String[] args){

        // HashSet<String> set = getStairPath(4);// wrong approach check code(at line 71) for more info
        // set.remove("");
        // System.out.println(set);
        int stairs = 4;

        ArrayList<String> path = optimizedPath(stairs);
        System.out.println(path);

        printStairPath(stairs, "");

    }

    // optimezed idea complexity n
    private static ArrayList<String> optimizedPath(int stairs){
        if(stairs == 0){
            ArrayList<String> AL = new ArrayList<String>();
            AL.add("");
            return AL;
        }
        else if(stairs < 0){ // when we subtract -1/-2 from stairs it'll become -ve so we return empty AL.
            ArrayList<String> AL = new ArrayList<String>();
            return AL;
        }


        ArrayList<String> path1 = optimizedPath(stairs - 1);
        ArrayList<String> path2 = optimizedPath(stairs - 2);
        ArrayList<String> path3 = optimizedPath(stairs - 3);

        ArrayList<String> paths = new ArrayList<>();

        // if path1 give us Al from n-1 to 0.So, if we add 1 then it'll give path fro n to 0
        for(String path: path1){ 
            paths.add(1 + path);
        }
        
        // if path2 give us Al from n-2 to 0.So, if we add 2 then it'll give path fro n to 0
        for(String path: path2){
            paths.add(2 + path);
        }
        
        // if path3 give us Al from n-3 to 0.So, if we add 3 then it'll give path fro n to 0
        for(String path: path3){
            paths.add(3 + path);
        }

        return paths;
    }


    // we simply print all paths rather then store them in an AL and return that AL.
    private static void printStairPath(int stairs, String ans){
        if(stairs == 0){
            System.out.print(ans + " ");
        }
        else if(stairs < 0)
            return;

        printStairPath(stairs - 1, ans + 1);
        printStairPath(stairs - 2, ans + 2);
        printStairPath(stairs - 3, ans + 3);
    }


    // This code is neither optimized nor correct as this code works fine till input = 3
    // but for input > 3 code give wrong answers(some paths are missed)
    // and the missed path increase exponentially.
    //  My idea(complexity n^2)
    private static HashSet<String> getStairPath(int stairs){
        if(stairs == 0){
            HashSet<String> s = new HashSet<String>();
            s.add("");
            return s;
        }

        HashSet<String> stepComb = getStairPath(stairs - 1);
        HashSet<String> nextStepComb = new HashSet<String>();

        for(String step: stepComb){
            int currStepSum = stringSum(step);
            for(int i = 0; i < 3; i++){
                if(currStepSum + possibleSteps[i] == stairs){
                    nextStepComb.add(step + possibleSteps[i]);
                    nextStepComb.add(possibleSteps[i] + step);
                    
                }
            }
        }
        nextStepComb.add("");

        return nextStepComb;
    } 

    private static int stringSum(String s){
        if(s.length() == 0)
            return 0;

        int numLen = s.length();
        int num = Integer.parseInt(s);
        int sum = 0;
        for(int i = 0; i < numLen; i++){
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }   
}
