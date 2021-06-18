import java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        String str = "aaamadam";    // longest palindrom is 'madam'

        // System.out.println(isPalindrome(str, 0, str.length()-1));
        System.out.println(longestPalindrome(str));
        // longestPalindrome(str);
    }


    // check wheather a string is palindrome string or not
    private static boolean isPalindrome(String str, int s, int e){
        if(str.charAt(s) != str.charAt(e))
            return false;

        if(s < e)
            isPalindrome(str, s+1, e-1);

        return true;
    }

    // Optimized method
    // return the longest palindromic string from a string
    private static String longestPalindrome(String str){
        int start = 0, end = 1;
        int l, h;

        for(int i = 1; i < str.length(); i++){

            // for even substring
            l = i - 1;
            h = i;

            while(l >= 0 && h < str.length() && str.charAt(l) == str.charAt(h)){
                if(h-l+1 > end){
                    start = l;
                    end = h-l+1;
                }
                l--;
                h++;
            }

            // for odd substring
            l = i - 1;
            h = i + 1;

            while(l >= 0 && h < str.length() && str.charAt(l) == str.charAt(h)){
                if(h-l+1 > end){
                    start = l;
                    end = h-l+1;
                }
                l--;
                h++;
            }
        }

        // printString(str, start, start+end-1);
        return str.substring(start, start+end);
    }

    // method to print substring
    private static void printString(String str, int start, int end){
        for(int i = start; i <= end; i++)
            System.out.print(str.charAt(i));
    }
    
}
