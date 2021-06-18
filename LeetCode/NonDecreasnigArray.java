// Statement: Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.
// We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).
// eg:- 4 5 6 = true;   4 2 3 = true;    4 2 1 = flase; 3 4 2 3 = false;    5 7 1 8 = true;     -1 4 2 3 = true.....etc.

import java.io.*;
public class NonDecreasnigArray {
    public static void main(String args[])throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        NonDecreasnigArray ob=new NonDecreasnigArray();
        System.out.print("Enter the size of an array: ");
        int size=Integer.parseInt(in.readLine());
        int nums[]=new int[size];
        for(int i=0;i<size;i++)
            nums[i]=Integer.parseInt(in.readLine());
        
        System.out.print(ob.checkPossibility(nums));
    }

    public boolean checkPossibility(int[] nums) {
        int count=0;
        for(int i=0;i<=nums.length-2;i++){
            if(nums[i]>nums[i+1]&&(i==0||i==nums.length-2))
                count++;   
            else{
                if(nums[i]>nums[i+1]){
                    if(nums[i-1]>=nums[i + 1]){
                        if(nums[i] > nums[i+2])
                             return false;
                    }         
                    count++;
                }
            }  
        }

        if(count<=1||nums.length==1)
            return true;
        else
            return false;
    }
}
