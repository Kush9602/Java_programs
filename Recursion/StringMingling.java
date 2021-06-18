public class StringMingling {
    public static void main(String[] args){
        String first = "aceg";
        String second = "bdfh";

        System.out.println(mingle(first, second, 0));

    }

    // using recusion(work only when the length os strings are same)
    private static String mingle(String s1, String s2, int index){
        if(index == s1.length())
            return "";
        
        String str = Character.toString(s1.charAt(index)) + Character.toString(s2.charAt(index));
        String mingleStr = mingle(s1, s2, index + 1);
        str += mingleStr;

        return str;   
    }


    // using loop
    // private static String merge(String s1, String s2){
    //     String s = "";
    //     for(int i = 0; i < s1.length() || i < s2.length(); i++){
    //         if(s1.length() > i)
    //             s += s1.substring(i , i + 1);
    //         if(s2.length() > i)
    //             s += s2.substring(i, i + 1);       
    //     }
                   
    //     return s;
    // }
    
}
