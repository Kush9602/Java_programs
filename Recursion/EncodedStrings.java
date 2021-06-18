public class EncodedStrings {
    public static void main(String[] args){

        String code = "25201";

        printEncoding(code, "");
    }

    private static void printEncoding(String code, String ans){
        if(code.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        else if(code.length() == 1){
            if(code.charAt(0) == '0')
                return;
            else{
                char ch3 = (char)(code.charAt(0) - '0' + 'a' - 1);
                ans += ch3;
                System.out.print(ans + " ");
                return;
            }
        }
        else if(code.charAt(0) == '0')
            return;
            
        char ch1 = (char)(code.charAt(0) - '0' + 'a' - 1);
        String rest1 = code.substring(1);
        printEncoding(rest1, ans + ch1);

        String ch12 = code.substring(0,2);
        int chInt = Integer.parseInt(ch12);
        String rest2 = code.substring(2);

        if(chInt <= 26){
            char ch2 = (char)(chInt + 'a' - 1);
            printEncoding(rest2, ans + ch2);
        }
        else
            return;

    }   
}
