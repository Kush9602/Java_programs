import java.util.*;

public class StringSubsequence {
    public static void main(String[] args){
        String str = "abc";

        ArrayList<String> al = getSubsequence(str);
        System.out.println(al);

        optimizeCode(str, "");
    }

    // expextations and faith method
    // space complexity is very very high(increase exponentially)
    // e.g if we pass string of 31 length, then this code take total of a^n-1* n space i.e 2^31 * 32 = 31Gb
    // so we follow level and option approch of revursion below this code
    private static ArrayList<String> getSubsequence(String str){
        if(str.length() == 0){
            ArrayList<String> s = new ArrayList<String>();
            s.add("");
            return s;     
        }
           
        char ch = str.charAt(0);
        String rest = str.substring(1);
        ArrayList<String> list = getSubsequence(rest);

        ArrayList<String> finalList = new ArrayList<String>();

        for(String string: list){
            finalList.add("" + string);
            finalList.add(ch + string);
        }
           
        return finalList;
    }
    
    // level and options methods
    // space complexity is highly reduced to (n-1)*n
    //  as this code directly print the answer in last satge(at the base case)
    private static void optimizeCode(String str, String returnStr){
        if(str.length() == 0){
            System.out.println(returnStr);
            return;
        }

        char ch = str.charAt(0);
        String s = str.substring(1);
        
        optimizeCode(s, returnStr + "");
        optimizeCode(s, returnStr + ch);
    }
}
