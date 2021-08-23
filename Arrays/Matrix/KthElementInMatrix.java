import java.util.*;

public class KthElementInMatrix {
    public static void main(String[] args) {
        KthElementInMatrix obj = new KthElementInMatrix();

        int[][] matrix = { { 16, 28, 60, 64 }, { 22, 41, 63, 91 }, { 27, 50, 87, 93 }, { 36, 78, 87, 94 } };
        int k = 3;

        obj.kthSmallestInMatrix(matrix, k);
    }

    // time complexity = O(n^2.log(k))
    public void kthSmallestInMatrix(int[][] matrix, int k) {
        // default PQ implements min heap, hence we use Collections.reverseOrder()
        PriorityQueue<Integer> heap = new PriorityQueue<>(k, Collections.reverseOrder());

        // we can also implement max heap using Comparator
        // PriorityQueue<Integer> heap = new PriorityQueue<>(new MyComparator());

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                heap.add(matrix[i][j]);
                if (heap.size() > k)
                    heap.poll();
            }
        }

        System.out.println(heap.poll());

    }

    // class MyComparator implements Comparator {
    // public int compare(Object o1, Object o2) {
    // Integer l1 = (Integer) o1;
    // Integer l2 = (Integer) o2;

    // return l2.compareTo(l1);
    // }
    // }

}
