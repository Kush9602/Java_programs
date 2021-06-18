import java.util.Scanner;
public class hollow_diamond {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Character between A to Z... ");
        char ch = scan.next().charAt(0);
        int m = ch - 65, c = 65,k, temp;
        temp = m;
        // For Upper hollow triangle
        for(int i = 1; i <= temp + 1; i++){ 
            for(int j = 1; j < m+1; j++)
                System.out.print(" ");
            m--;

            for(k = 1; k <= i; k++){
                if(k == 1)
                    System.out.print((char)c);
                if(k == i && k != 1){
                    for(int j = 1; j < k*2-2; j++)
                        System.out.print(" ");
                    System.out.print((char)c );
                }                
            }   
            c++;        
            System.out.println();
        } 

        // For Lower hollow triangle
        c = c - 2;
        int n = 1;
        int space = temp * 2 - 3;
        for(int i = temp; i >= 1; i--){
            for(int j = 1; j <= n; j++)
                System.out.print(" ");
            n++;

            for(int l = 1;l <= i; l++){
                if(l == 1)
                    System.out.print((char)c);
                
                if(l == i && l != 1){
                    for(int x = 1; x <= space;x++)
                        System.out.print(" ");
                    System.out.print((char)c);
                }                  
            }
            c--;
            space = space - 2;
            System.out.println();
        }           
    }   
}   
