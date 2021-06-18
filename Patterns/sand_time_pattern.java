public class sand_time_pattern {

    public static void main(String[] args) {
        
        for(int i = 1; i <= 7; i++){
            int m = i;
            for(int k = 1; k < i; k++)
                System.out.print(" ");
            
            for(int j = 7; j >= i; j--){
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }

        for(int i = 6; i >= 1; i--){
            int m = i;
            for(int k = 1; k < i; k++)
                System.out.print(" ");
            
            for(int j = 1; j <= 7 - i + 1; j++){
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }
        
    }
}
