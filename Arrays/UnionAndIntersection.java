import java.io.*;

public class UnionAndIntersection {
    public static void main(String[] args)throws IOException{

        System.out.print("Enter the element of array in single line: ");
        String array1[] = getStringArray();

        System.out.print("Enter the element of array in single line: ");
        String array2[] = getStringArray();

        String union[] = union(array1, array2);
        System.out.print("Union is: ");
        printArray(union);
        System.out.print("Intersection is: ");
        String intersection[] = intersection(array1, array2);
        printArray(intersection);
    }


    // BEST WAY TO IN-TAKE THE ARRAY AS STRING
    static String[] getStringArray()throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String str = in.readLine();
        String str1[] = str.split(",");
        
        return str1;
            
    }

    // This function print array
    static void printArray(String ar[]){
        for(int i = 0; i < ar.length; i++)
            System.out.print(ar[i] + " ");
        System.out.println();
    }

    // find the union of two arrays
    static String[] union(String arr1[], String arr2[]){
        int len1 = arr1.length;
        int len2 = arr2.length;
        String temp[] = new String[len1 + len2];

        System.arraycopy(arr1, 0, temp, 0, len1);         // add two arrays
        System.arraycopy(arr2, 0, temp, len1, len2);  // (array_name, copy_index_from_array, copy_to_array, index copy_from, infrx_copy_to);
        
        String string = createString(temp);
        String union[] = string.split("@");
        return union;
    }

    // create strig from array with distinct elements
    static String createString(String arr[]){
        String str = "";

        for(int i = 0; i < arr.length; i++){
            String unique[] = str.split("@"); 
            String element = arr[i];
            int flag = 0;
            for(int j = 0; j < unique.length; j++){
                if(element.equals(unique[j]))
                    flag = 1;  
            }
            if(flag != 1)
                str = str + element + "@";
        
        }

        return str;
    }

    // give intersection between two arrays
    static String[] intersection(String arr1[], String arr2[]){
        String str = "";
        for(int i = 0; i < arr1.length; i++){
            int flag = 0;
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i].equals(arr2[j])){
                    flag = 1;
                }
            }
            String temp[] = str.split("@");
            for(int k = 0; k < temp.length;k++){
                if(arr1[i].equals(temp[k]))
                    flag = 0;
            }

            if(flag == 1)
                str = str + arr1[i] + "@";

        }
        String intersection[] = str.split("@");
        return intersection;
    }   
}
//  [1,1,1] [1,1,1] = union[1]
