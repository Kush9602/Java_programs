public class FloodFillMaze {
    public static void main(String[] args){
        int[][] arr = { {0,1,0,0,0,0},
                        {0,1,0,1,1,0},
                        {0,0,0,0,0,0},
                        {1,0,1,1,0,1},
                        {1,0,0,0,0,0}
                      };
                      
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        printPath(arr, 0, 0, "", visited);
    }

    // path from (0,0) to (r,c) with some conditions, given below:
    // 1) only one step at a time in any four directions.
    // 2) can't cross 1
    // 3) if we visit then we can't repeat the same path
    private static void printPath(int[][] arr, int r, int c, String path, boolean[][] visited){
        int row = arr.length;
        int col = arr[0].length;

        if(r >= row || r < 0 || c >= col || c < 0 || arr[r][c] == 1 || visited[r][c] == true)
            return;

        if(r == row - 1 && c == col - 1){
            System.out.print(path + " ");
            return;
        }
        
        visited[r][c] = true;
        printPath(arr, r - 1, c, path + "u", visited);   // up
        printPath(arr, r + 1, c, path + "d", visited);   // down
        printPath(arr, r, c + 1, path + "r", visited);   // right
        printPath(arr, r, c - 1, path + "l", visited);   // left
        visited[r][c] = false;

    }
    
}
