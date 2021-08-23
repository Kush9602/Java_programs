import java.util.*;

public class test {
    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

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
