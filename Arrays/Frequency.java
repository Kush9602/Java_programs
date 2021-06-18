import java.util.Scanner;
public class Frequency {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
        ArrayClasses ob = new ArrayClasses();

        int array[] = ob.getArray();
        
        System.out.print("Enter no. you wanna search in array: ");   
        int k = scan.nextInt();
        ob.frequency(array, k);
    }


}
