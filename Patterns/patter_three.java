public class patter_three {
    public static void main(String[] args){
        int m=9;
        for(int i = 1; i <= 9; i++){
            for(int k=0;k<m;k++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
            m--;
         }
    }
}