import java.util.*;
public class BucketSorting {
    public static void main(String[] args){
        float[] arr = { (float) 0.492, (float) 0.342, (float) 0.393, (float) 0.562, (float) 0.367, (float) 0.487, (float) 0.521 };

        BucketSort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " "); 
    }

    private static void BucketSort(float[] arr){
        Vector<Float>[] bucket = new Vector[10];

        for(int i = 0; i < 10; i++)
            bucket[i] = new Vector<Float>();

        for(int i = 0; i < arr.length; i++){
            float index = arr[i]*10;
            bucket[(int)index].add((float)arr[i]);
        }

        for(int i = 0; i < 10; i++)
            Collections.sort(bucket[i]);

        int index = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < bucket[i].size(); j++)
                arr[index++] = (float)bucket[i].get(j);      
        }

    }
}
