
public class test{
    public static void main(String[] args){

        int m = 5, c = 69,temp;
        temp = m ;
        int n = 1;
        int space = 7;
        // System.out.println(space);
        for(int i = temp; i >= 1; i--){
            for(int j = 1; j < n; j++)
                System.out.print(" ");
            n++;
            
            for(int l = 1;l <= i; l++){
                if(l == 1)
                    System.out.print((char)c);

                if(l == i && l != 1){
                    for(int x = 1; x <= space; x++)
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

