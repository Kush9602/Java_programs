import java.util.*;

public class ValidShuffle {
    static HashMap<Character, Integer> input = new HashMap<>();

    public static void main(String[] args) {
        String first = "XX";
        String second = "XX";

        createInputMap(first, second);

        String[] result = { "XXXX", "XXXY", "YXXXX" };

        for (int i = 0; i < result.length; i++)
            isValid(first, second, result[i]);
    }

    static void isValid(String first, String second, String result) {
        if (result.length() != first.length() + second.length()) {
            System.out.println(result + " is not a valid shuffle for " + first + " and " + second);
            return;
        }

        HashMap<Character, Integer> res = new HashMap<>();

        // for result
        for (int i = 0; i < result.length(); i++) {
            if (!res.containsKey(result.charAt(i)))
                res.put(result.charAt(i), 1);
            else
                res.put(result.charAt(i), res.get(result.charAt(i)) + 1);
        }

        if (res.equals(input))
            System.out.println(result + " is a valid shuffle for " + first + " and " + second);
        else
            System.out.println(result + " is not a valid shuffle for " + first + " and " + second);
    }

    // create hash for inputs
    static void createInputMap(String first, String second) {
        for (int i = 0; i < first.length(); i++) {
            if (!input.containsKey(first.charAt(i)))
                input.put(first.charAt(i), 1);
            else
                input.put(first.charAt(i), input.get(first.charAt(i)) + 1);
        }

        for (int i = 0; i < second.length(); i++) {
            if (!input.containsKey(second.charAt(i)))
                input.put(second.charAt(i), 1);
            else
                input.put(second.charAt(i), input.get(second.charAt(i)) + 1);
        }
    }
}