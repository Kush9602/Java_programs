import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 9 }, { 2, 5 }, { 19, 20 }, { 10, 11 }, { 12, 20 }, { 0, 3 }, { 0, 1 }, { 0, 2 } };

        mergeIntervals(intervals);

    }

    static void mergeIntervals(int[][] intervals) {
        if (intervals.length == 0 || intervals == null) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merge = new LinkedList<>();

        for (int[] interval : intervals) {
            if (merge.isEmpty() || merge.getLast()[1] < interval[0])
                merge.add(interval);

            else {
                merge.getLast()[1] = Math.max(merge.getLast()[1], interval[1]);
            }
        }

        // for (int[] item : merge) {
        // for (int ele : item)
        // System.out.print(ele + " ");
        // System.out.println();
        // }

        return merge.toArray(new int[merge.size()][]);
    }
}

// ArrayList[] merge = new ArrayList[intervals.length];

// for(int i = 0; i < merge.length; i++)
// merge[i] = new ArrayList(2);

// int alPoint = 0;
// merge[alPoint].add(intervals[0][0]);
// merge[alPoint].add(intervals[0][1]);

// for(int i = 1; i < intervals.length; i++){
// if(merge[alPoint].get(1).equals(intervals[i][0]))
// merge[alPoint].set(1,intervals[i][2]);

// else{
// alPoint++;
// merge[alPoint].add(intervals[i][0]);
// merge[alPoint].add(intervals[i][1]);
// }
// }
