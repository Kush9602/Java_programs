import java.util.*;
public class test {
    public static void main(String[] args){
        
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        
        l1.add(2);
        l1.add(1);
        l1.add(6);
        l1.add(4);
        // System.out.println(l1);
 
        System.out.println(solve(l1));
    }

    //finding total Special Number
    public static int solve(LinkedList<Integer> A) {
        int specNumber = 0;
        
        for(int i = 0 ; i < A.size(); i++){
            int evenSum = 0, oddSum = 0;
            LinkedList<Integer> temp = new LinkedList<Integer>(A);
            temp.remove(i);
            
            if(i % 2 == 0)
                evenSum += temp.get(i);
            else
                oddSum += temp.get(i);
            // System.out.println("iter " + i + " " + temp);

            if(evenSum == oddSum)
                specNumber++;
        }
        
        return specNumber;
    }
  
    
}
