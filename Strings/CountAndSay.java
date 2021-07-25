
/*
Input: n = 4
Output: "1211"
Explanation:
    countAndSay(1) = "1"
    countAndSay(2) = say "1" = one 1 = "11"
    countAndSay(3) = say "11" = two 1's = "21"
    countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 */
import java.io.*;

public class CountAndSay {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        System.out.println(countAndSay(n));
    }

    static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String str = countAndSay(n - 1);
        String ans = "";
        char ch = str.charAt(0);
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.length() == 1)
                ans = "" + count + ch;
            else if (i + 1 < str.length() && str.charAt(i + 1) == ch)
                count++;
            else {
                ans += "" + count + ch;
                count = 1;
                ch = (i + 1 < str.length()) ? str.charAt(i + 1) : str.charAt(i);
            }
        }

        return ans;
    }
}
