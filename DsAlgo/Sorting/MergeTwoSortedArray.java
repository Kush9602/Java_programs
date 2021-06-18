// Merge two arrays using GAP method.

public class MergeTwoSortedArray {
    public static void main(String[] args){
        SortingClass ob = new SortingClass();
        int a1[] = ob.getArray();
        int a2[] = ob.getArray();

        merge(a1, a2, a1.length, a2.length);
        ob.printArray(a1);
        ob.printArray(a2);
    }

    // caculating gap
    private static int nextgap(int gap){
        if(gap <= 1)
            return 0;
        // return Math.ceil(gap/2);        // max value of the gap
        return gap/2 + gap % 2;
    }

    private static void merge(int[] a1, int[]  a2, int m, int n){
        int gap = m + n, i , j;
        for(gap = nextgap(gap); gap > 0; gap = nextgap(gap)){

            // Compare and swap within array a1
            for(i = 0 ; i + gap < m; i++){
                if(a1[i] > a1[i + gap]){
                    a1[i] = a1[i] + a1[i+gap];
                    a1[i+gap] = a1[i] - a1[i+gap];
                    a1[i] = a1[i] - a1[i+gap];
                }
            }

            // Compare and swap elemnent in both arrays
            for(j = gap > m ? gap - m : 0; i < m && j < n ; i++, j++){
                if(a1[i] > a2[j]){
                    a1[i] = a1[i] + a2[j];
                    a2[j] = a1[i] - a2[j];
                    a1[i] = a1[i] - a2[j];
                }
            }

            // Compare and swap element of array a2
            if(j < n){
                for(j = 0; i + gap < n; j++){
                    if(a2[j] > a2[j + gap]){
                        a2[j] = a2[j] + a2[j+gap];
                        a2[j+gap] = a2[j] - a2[j+gap];
                        a2[j] = a2[j] - a2[j+gap];
                    }
                }
            }
        }
    }
    
}
