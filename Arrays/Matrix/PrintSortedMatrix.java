import java.util.*;

public class PrintSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

        sortedMatrix(matrix, 4, 4);

    }

    // Time complexity = O(m.n.log(n))
    // log(n) for recreating heap every time
    // Space Complexity = O(n)
    static void sortedMatrix(int[][] matrix, int m, int n) {
        // ArrayList<Integer> list = new ArrayList<Integer>();

        ArrayList<heapNode> heap = new ArrayList<heapNode>(n);
        for (int i = 0; i < n; i++) {
            heapNode node = new heapNode(matrix[0][i], 0, i);
            heap.add(node);
        }

        for (int i = 0; i < m * n; i++) {
            // list.add(heap.get(0).element);
            System.out.print(heap.get(0).element + " ");
            int r = heap.get(0).row;
            int c = heap.get(0).col;

            if (r + 1 < m) {
                heap.get(0).element = matrix[r + 1][c];
                heap.get(0).row = r + 1;
            } else
                heap.get(0).element = Integer.MAX_VALUE;

            heapify(heap, 0, n);

        }

        // System.out.print(list);
    }

    // creating a min heap
    static void heapify(ArrayList<heapNode> heap, int start, int end) {
        int min = start;
        int leftChild = 2 * start + 1;
        int rightChild = 2 * start + 2;

        if (leftChild < end && heap.get(min).element > heap.get(leftChild).element)
            min = leftChild;

        if (rightChild < end && heap.get(min).element > heap.get(rightChild).element)
            min = rightChild;

        if (min != start) {
            swap(heap, min, start);
            heapify(heap, min, end);
        }
    }

    static void swap(ArrayList<heapNode> arr, int a, int b) {
        // swap element
        int temp = arr.get(a).element;
        arr.get(a).element = arr.get(b).element;
        arr.get(b).element = temp;

        // swap row
        int temp1 = arr.get(a).row;
        arr.get(a).row = arr.get(b).row;
        arr.get(b).row = temp1;

        // swap col
        int temp2 = arr.get(a).col;
        arr.get(a).col = arr.get(b).col;
        arr.get(b).col = temp2;
    }

    static class heapNode {
        int element;
        int row;
        int col;

        public heapNode(int element, int row, int col) {
            this.element = element;
            this.row = row;
            this.col = col;
        }
    }

}
