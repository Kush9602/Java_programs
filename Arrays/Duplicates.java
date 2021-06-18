import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter element of an array in a single line: ");
        String str = scan.nextLine();
        String array[] = str.split(",");
        
        getDuplicates(array);
    }

    static void getDuplicates(String arr[]){
        int flag = 0;
        System.out.print("Repeated elements are: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i].equals(arr[j]))
                    flag = 1;
            }

            for(int k = 0; k < i; k++){
                if(arr[k].equals(arr[i]))
                    flag = 0;
            }

            if(flag == 1)
                System.out.print(arr[i] + " ");
        }
    }   
    
}

// [12,2,2,2,12]
//     k i j