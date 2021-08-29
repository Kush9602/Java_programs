// 0: Empty cell            1: Cells have fresh oranges             2: Cells have rotten oranges
// Determine what is the minimum time required so that all the oranges become rotten.
// A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] 
// (up, down, left and right). If it is impossible to rot every orange then simply return -1.

import java.util.*;

public class RottenOranges {
    public static void main(String[] args) {
        RottenOranges ro = new RottenOranges();
        int[][] bucket = { { 2, 1, 0, 2, 1 }, { 1, 0, 1, 2, 1 }, { 1, 0, 0, 2, 1 } };

        // int time = minTimeBF(bucket);
        int time = ro.minTimeOptimized(bucket);
        System.out.print(time);
    }

    public int minTimeOptimized(int[][] bucket) {
        Queue<RottenIndex> queue = new LinkedList<RottenIndex>();
        int time = 0;

        for (int row = 0; row < bucket.length; row++) {
            for (int col = 0; col < bucket[0].length; col++) {
                if (bucket[row][col] == 2)
                    queue.add(new RottenIndex(row, col));
            }
        }

        // this denotes that this is the end of first itteration
        queue.add(new RottenIndex(-1, -1));

        while (!queue.isEmpty()) {
            boolean flag = false;

            // if not delimiter
            while (queue.peek().row != -1 && queue.peek().col != -1) {
                RottenIndex index = queue.peek();
                int row = index.row;
                int col = index.col;

                // up
                if (row - 1 >= 0 && bucket[row - 1][col] == 1) {
                    if (!flag) {
                        time++;
                        flag = true;
                    }
                    bucket[row - 1][col] = 2;
                    queue.add(new RottenIndex(row - 1, col));
                }
                // left
                if (col - 1 >= 0 && bucket[row][col - 1] == 1) {
                    if (!flag) {
                        time++;
                        flag = true;
                    }
                    bucket[row][col - 1] = 2;
                    queue.add(new RottenIndex(row, col - 1));
                }
                // down
                if (row + 1 < bucket.length && bucket[row + 1][col] == 1) {
                    if (!flag) {
                        time++;
                        flag = true;
                    }
                    bucket[row + 1][col] = 2;
                    queue.add(new RottenIndex(row + 1, col));
                }
                // right
                if (col + 1 < bucket[0].length && bucket[row][col + 1] == 1) {
                    if (!flag) {
                        time++;
                        flag = true;
                    }
                    bucket[row][col + 1] = 2;
                    queue.add(new RottenIndex(row, col + 1));
                }

                queue.remove();
            }

            queue.remove();

            if (!queue.isEmpty())
                queue.add(new RottenIndex(-1, -1));

        }

        // if there is fresh orange even after traverse bucket
        for (int row = 0; row < bucket.length; row++) {
            for (int col = 0; col < bucket[0].length; col++) {
                if (bucket[row][col] == 1)
                    return -1;
            }
        }

        return time;
    }

    // keep track of element index where oranges are rotten(i.e 2)
    class RottenIndex {
        int row;
        int col;

        public RottenIndex(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    // Brute force
    // Time complexity = O((r*c)*(r*c))
    static int minTimeBF(int[][] bucket) {
        int rot = 2;
        boolean change = false;

        // while loop runs max of (r * c) / 2
        while (true) {
            // r * c
            for (int row = 0; row < bucket.length; row++) {
                for (int col = 0; col < bucket[0].length; col++) {
                    if (bucket[row][col] == rot) {
                        // check up
                        if (row - 1 >= 0 && bucket[row - 1][col] == 1) {
                            bucket[row - 1][col] = rot + 1;
                            change = true;
                        }
                        // check down
                        if (row + 1 < bucket.length && bucket[row + 1][col] == 1) {
                            bucket[row + 1][col] = rot + 1;
                            change = true;
                        }
                        // check left
                        if (col - 1 >= 0 && bucket[row][col - 1] == 1) {
                            bucket[row][col - 1] = rot + 1;
                            change = true;
                        }
                        // check right
                        if (col + 1 < bucket[0].length && bucket[row][col + 1] == 1) {
                            bucket[row][col + 1] = rot + 1;
                            change = true;
                        }
                    }
                }
            }

            if (change == false)
                break;

            change = false;
            rot++;
        }

        for (int row = 0; row < bucket.length; row++) {
            for (int col = 0; col < bucket[0].length; col++) {
                if (bucket[row][col] == 1)
                    return -1;
            }
        }

        return rot - 2;
    }
}
