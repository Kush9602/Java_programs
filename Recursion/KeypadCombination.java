import java.util.*;
public class KeypadCombination {
    // alphabets on keys(0-9)
    private static String[] keypad = {",;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "uv", "wx", "yz"};
    public static void main(String[] args){
        String num_press = "789";   // key that have been pressed
        ArrayList<String> AL = keypadCombination(num_press);
        System.out.println(AL);

        printKeypadComb(num_press, "");

    }

    private static ArrayList<String> keypadCombination(String press){
        if(press.length() == 0){
            ArrayList<String> str = new ArrayList<String>();
            str.add("");
            return str;
        }

        char strIndex = press.charAt(0);
        String remain = press.substring(1);

        ArrayList<String> comb = keypadCombination(remain);
        ArrayList<String> result = new ArrayList<String>();

        String padCode = keypad[strIndex - '0'];
        for(int i = 0; i < padCode.length(); i++){
            char ch = padCode.charAt(i);
            for(String code: comb)
                result.add(ch + code);
        }
    
        return result;
    }


    // rather than put sequence in a AL we simply print the sequences
    // obviously it decrease the space complexity
    private static void printKeypadComb(String press, String ans){
        if(press.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        char ch = press.charAt(0);
        String rest = press.substring(1);
        String str = keypad[ch - '0'];
        
        for(int i = 0; i < str.length(); i++){
            printKeypadComb(rest, ans + str.charAt(i));
        }

    }
}
