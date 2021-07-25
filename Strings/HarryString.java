// If any spell contains all the vowels in alphabetical order then that spell is categorized as Good. 
// If it contains the vowels in reverse alphabetical order , then that spell is categorized as Worst. 
// All the other spells that do not fall in any of the categories before are categorized as Bad. 

import java.io.*;
import java.util.*;

public class HarryString {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        magicWord(str);

    }

    static void magicWord(String str) {
        ArrayList<Character> list = new ArrayList<Character>();
        ArrayList<Character> copy = new ArrayList<Character>();
        ArrayList<Character> reverse = new ArrayList<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                list.add(ch);
        }

        copy.addAll(list);
        reverse.addAll(list);

        Collections.sort(list);
        Collections.sort(reverse, Collections.reverseOrder());

        if (copy.equals(list) == true)
            System.out.println("Good");
        else if (copy.equals(reverse) == true)
            System.out.println("Worst");
        else
            System.out.println("Bad");
    }
}
