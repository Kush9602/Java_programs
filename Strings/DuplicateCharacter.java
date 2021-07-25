import java.util.*;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "string test";
        // o/p: t - 3 , s - 2

        countChar(str);
    }

    static void countChar(String str) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (!hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i), 1);
            else
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
        }

        for (Map.Entry ele : hm.entrySet()) {
            char key = (char) ele.getKey();
            int value = (int) ele.getValue();

            if (value > 1) {
                System.out.println(key + " -> " + value);
            }
        }
    }
}
