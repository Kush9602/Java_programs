import java.util.Scanner;
public class chrismas_tree {
    public static void main(String[] args){
        int m = 0, branch , space, temp, height;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the tree... ");
        height = in.nextInt();
        while(height == 1){
            System.out.println("Height must be greater than one.");
            System.out.print("Enter the height of the tree... ");
            height = in.nextInt();
            if(height > 1)
                break;
        }

        // for printing branches
        for(branch = 1; branch <= height; branch++){
            space = (5+(height-1)*3) - m; // minimun space is "(5+(height-1)*2) - m" but for better visualizations and avoid unstructured spacing, we use *3
            int star_counter = 1 + m;
            temp = star_counter;
            for(int i = 1 ; i <= 5; i++){
                
                for(int j = 1; j <= space; j++){
                    System.out.print(" ");    
                }
                space--;
                for(int k = 1; k <= temp; k++){
                    System.out.print("* ");
                }
                temp++;
                System.out.println();
            }
            m = m + 2; 
            // for printing stem  
            if(branch == height){
                int base_length = 4, base_breath = 3, temp_branch = branch, stem_height = height;
                int stem_breath = (branch > 3)?temp_branch - 1:base_breath;
                stem_height = (height > 3)?height:base_length;
                for(int i = 1; i < stem_height; i++){
                    for(int j = 1; j <= temp_branch*3-1; j++)
                        System.out.print(" ");

                    for(int k = 1; k <= stem_breath; k++)
                        System.out.print("* ");

                    System.out.println();
                }
            }  
        }
    }
}
