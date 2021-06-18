public class FloodFill {
    public static void main(String[] args){
        int[][] arr = { {1,1,1,1,1,1},
                        {0,1,1,0,2,0},
                        {1,1,1,2,2,1},
                        {2,2,1,0,1,1},
                        {2,1,1,1,2,1},
                      };
                    
        floodFill(arr, 2, 2, 9, 1);
        printArray(arr);
    }

    private static void floodFill(int[][] arr, int r, int c, int toFill, int prevFill){
        int row = arr.length;
        int col = arr[0].length;

        if(r >= row || r < 0 || c >= col || c < 0)
            return;
        if(arr[r][c] != prevFill)
            return;

        arr[r][c] = toFill;

        floodFill(arr, r - 1, c, toFill, prevFill); // up
        floodFill(arr, r + 1, c, toFill, prevFill); // down
        floodFill(arr, r, c + 1, toFill, prevFill); // right
        floodFill(arr, r, c - 1, toFill, prevFill); // left

        return;
    }

    private static void printArray(int[][] arr){
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++)
                System.out.print(arr[r][c] + " ");
            System.out.println();
        }
    }
    
}
