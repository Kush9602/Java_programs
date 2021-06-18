public class Permutation {
    public static void main(String[] args){
        String letter = "aac";
        printPermutation(letter, "");
    }


    private static void printPermutation(String letter, String ans){
        if(letter.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        
        for(int i = 0; i < letter.length(); i++){
            char ch = letter.charAt(i);
            String s = letter.substring(0,i) + letter.substring(i+1);
            printPermutation(s, ans + ch);
        }
       
    }
    
}
