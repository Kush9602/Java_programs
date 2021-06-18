import java.util.*;
public class shad_chris {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int height,c,i,j,k,sp;
        System.out.println("Enter the height of thr tree...");
        height=in.nextInt();
        int star_c=1;
        int temp_space=(5+(height-1)*2)-1;
        int temp=star_c;
        //for Counting each block.....
        for(c=1;c<=height;c++)
        {
            temp=star_c;
            sp=temp_space;
            for(i=1;i<=5;i++)
            {
                for(k=1;k<=sp;k++)
                {
                    System.out.print(" ");
                }
                for(j=1;j<=temp;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
                sp=sp-1;
                temp++;
            }
            star_c=star_c+2;
            temp_space=temp_space-2;
            if(c==height)
            {
                int space=(5+(height-1)*2)-3;
                for(i=1;i<4;i++)
                {
                    for(k=1;k<=space;k++)
                    {
                        System.out.print(" ");
                    }
                    for(j=1;j<height;j++)
                    {
                      System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
